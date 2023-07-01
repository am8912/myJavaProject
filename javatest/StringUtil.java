package javatest;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StringUtil {
	public static final String UPPERCASE_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String DIGIT_CHAR = "0123456789";
	public static final String PASSWORD_CHAR = "abcdefghijklmnopqrstuvwxyz" + UPPERCASE_CHAR + DIGIT_CHAR;
	public static final Pattern ALL_LETTER = Pattern.compile("[a-zA-Z]*");
    public static final Pattern ALL_DIGIT = Pattern.compile("[0-9]*");
    public static final Pattern LETTER_DIGIT = Pattern.compile("[a-zA-Z0-9]*");
    public static final Pattern TWPID_PATTERN = Pattern.compile("[ABCDEFGHJKLMNPQRSTUVXYWZIO][12]\\d{8}");
    public static final Pattern TWBID_PATTERN = Pattern.compile("^[0-9]{8}$");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9&._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    public static String[] characterArr = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
        								   "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    public static String SMS_TOKEN = "28C2B76783B57032140C3EF04AE68823";
    public static String FAX_TOKEN = "5X4BHR3ZW53NZAVF2QJKS40N1AO0EMW0";
    static String [] chineseNumber = {"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
    static String [] chineseUnit = {"","拾","佰","仟","萬","拾萬","佰萬","仟萬","億","拾億"};
	
    /**
     * 判斷是否為NULL
     * @param value
     * @return 若null或字串的null,則回傳空字串
     */
	public static String notNull(Object value){
        if(value == null || "null".equals(value)){
            return "";
        }
        return value.toString().trim();
    }
	
	
	public static String getMD5(byte[] source) {
	  String s = null;
	  char hexDigits[] = {       // 用来将字节转换成 16 进制表示的字符
	     '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',  'e', 'f'};
	   try
	   {
	    java.security.MessageDigest md = java.security.MessageDigest.getInstance( "MD5" );
	    md.update( source );
	    byte tmp[] = md.digest();          // MD5 的计算结果是一个 128 位的长整数，
	                                                // 用字节表示就是 16 个字节
	    char str[] = new char[16 * 2];   // 每个字节用 16 进制表示的话，使用两个字符，
	                                                 // 所以表示成 16 进制需要 32 个字符
	    int k = 0;                                // 表示转换结果中对应的字符位置
	    for (int i = 0; i < 16; i++) {          // 从第一个字节开始，对 MD5 的每一个字节
	                                                 // 转换成 16 进制字符的转换
	     byte byte0 = tmp[i];                 // 取第 i 个字节
	     str[k++] = hexDigits[byte0 >>> 4 & 0xf];  // 取字节中高 4 位的数字转换, 
	                                                             // >>> 为逻辑右移，将符号位一起右移
	     str[k++] = hexDigits[byte0 & 0xf];            // 取字节中低 4 位的数字转换
	    }
	    s = new String(str);                                 // 换后的结果转换为字符串

	   }catch( Exception e )
	   {
	    e.printStackTrace();
	   }
	   return s;
	 }
	/**
	 * 產生密碼
	 * @param length
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static String genRandomPassword(int length) throws IllegalArgumentException{
		if ( length < 1 ){
		    throw new IllegalArgumentException("length must greater than 1");
		}
		StringBuffer passwordBuff = new StringBuffer();
		Random myRandom = new Random();
		int len = PASSWORD_CHAR.length();
		for (int cnt = 0; cnt < length; cnt++){
		    char ch = PASSWORD_CHAR.charAt(myRandom.nextInt(len));
		    passwordBuff.append(ch);
		}
		String pw = passwordBuff.toString();
		return pw;
	}

	
	/**
	 * 產生API KEY
	 * @param length
	 * @return
	 */
	public static String genApiKey(int length){
		String base = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz0123456789!$_-";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<length; i++){
			int random = (int)(Math.random()*base.length());
			sb.append(base.charAt(random));
		}
		
		return sb.toString();
	}
	
	/**
	 * 是否全為數字
	 * @param data
	 * @return 
	 */
	public static boolean isAllDigit(String data) {
		if(data.startsWith("-")) return ALL_DIGIT.matcher(data.replaceFirst("-", "")).matches();
		return ALL_DIGIT.matcher(data).matches();
	}
	
	/**
	 * 是否全為數字
	 * @param data
	 * @param isNegative : true表示可包括負號
	 * @return
	 */
	public static boolean isAllDigit(String data, boolean isNegative) {
		if (isNegative) {
			if(data.startsWith("-")) return ALL_DIGIT.matcher(data.replaceFirst("-", "")).matches();
		}
		return ALL_DIGIT.matcher(data).matches();
	}
	/**
	 * 是否全為英文
	 * @param data
	 * @return
	 */
	public static boolean isAllLetter(String data) {
		return ALL_LETTER.matcher(data).matches();
	}
	/**
	 * 是否為英數字
	 * @param data
	 * @return
	 */
	public static boolean isLetterOrDigit(String data){
		return LETTER_DIGIT.matcher(data).matches();
	}
	/**
	 * 檢查數字的數位是否正確
	 * @param value 數字
	 * @param digit 整數的長度
	 * @param decimalDigit 小數點後的長度
	 * @return
	 */
	public static boolean isDigitsCorrect(String value, int digit, int decimalDigit)
    {
    	try{
    		Double.parseDouble(value);
    	}catch(Exception e){
    		return false;
    	}
        if ( -1 == (value.indexOf(".")))
        {
            if (value.length() > digit)
            {
                return false;
            }
            else
            {
              for (int i = 0; i < value.length(); i++)
              {
                if ( -1 == (DIGIT_CHAR.indexOf(value.substring(i, i+1))))
                {
                  return false;
                }
              }
            }
        }
        else
        {
            String wholeNum = value.substring(0, value.indexOf(".")); ;
            String decimal = value.substring(value.indexOf(".") + 1);
            if ( (wholeNum.length() > digit) ||
                (decimal.length() > decimalDigit))
            {
                return false;
            }
            else
            {
              for (int i = 0; i < wholeNum.length(); i++)
              {
                if ( -1 == (DIGIT_CHAR.indexOf(wholeNum.substring(i, i+1))))
                {
                  return false;
                }
              }
              for (int i = 0; i < decimal.length(); i++)
              {
                if ( -1 == (DIGIT_CHAR.indexOf(decimal.substring(i, i+1))))
                {
                  return false;
                }
              }
            }

        }
        return true;
    }
	/**
	 * 字串補0
	 * @param str 要補0的字串
	 * @param num 補0後的字串長度
	 * @param isBehind true:補0在後/false:補0在前
	 * @return
	 */
	public static String addZero(String str, int num,boolean isBehind){
		String z = "";
        for (int i=str.length() ; i<num; i++)
        {
            z = z + "0";
        }
        return isBehind?str + z:z + str;
	}
	/**
	 * 字串補空白
	 * @param str 要補空白的字串
	 * @param num 補完後的字串長度
	 * @param isBehind true:補空白在後/false:補空白在前
	 * @return
	 */
	public static String addSpace(String str, int num,boolean isBehind){  
		if(notNull(str).length() > num){
    		return str;
    	}
        String z = "";
        for (int i=notNull(str).getBytes().length ; i<num; i++)
        {
            z = z + " ";
        }
        return isBehind?notNull(str) + z:z + notNull(str);
	}
	/**
	 * 字串補空白(UTF-8)
	 * @param str 要補空白的字串
	 * @param num 補完後的字串長度
	 * @param isBehind true:補空白在後/false:補空白在前
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String addSpace(String str, int num,boolean isBehind,String encode) throws UnsupportedEncodingException{  
		if(notNull(str).length() > num){
    		return str;
    	}
        String z = "";
        for (int i=notNull(str).getBytes(encode).length ; i<num; i++)
        {
            z = z + " ";
        }
        return isBehind?notNull(str) + z:z + notNull(str);
	}
	
	/**
	 * Fill right with spaces.
	 * 
	 * @param value
	 *            The original string.
	 * @param length
	 *            The length that you want to have.
	 * @return The String that had been filled right with spaces.
	 * @throws UnsupportedEncodingException 
	 */
	public static String fillRightWithSpace(String value, int length) throws UnsupportedEncodingException {
		String rtnStr = "";
		String strTmp = "";

		byte[] nbytes = new byte[length];
		byte[] tmpByte = value.getBytes("UTF-8");
		if (tmpByte.length < length) {
			for (int i = 1; i <= (length - tmpByte.length); i++) {
				strTmp = strTmp + " ";
			}
			rtnStr = value + strTmp;

		} else {
			for (int i = 0; i < length; i++) {
				nbytes[i] = tmpByte[i];
			}
			rtnStr = new String(nbytes);
		}

		return rtnStr;
	}
	
	/**
	 * 左靠右補字元
	 * @param unformatString
	 * @param paddingLength
	 * @param paddingChar
	 * @return
	 * 說明: ASCII長度會等於1, 非ASCII碼(中文)則以長度2計算
	 * 主要用來做列印字元的計算
	 */
	public static String PadRight(String unformatString, int paddingLength, char paddingChar) {
		try {
			if (unformatString == null) unformatString = "";
			int totalLength = GetCJKStringLength(unformatString);
			if (totalLength > paddingLength) {//截掉多餘的部份
				StringBuffer sbFormatString = new StringBuffer();
				for (Character oneChar : unformatString.toCharArray()) {
					if (GetCJKStringLength(sbFormatString.toString() + oneChar) > paddingLength) break;
					else sbFormatString.append(oneChar);
				}
				unformatString = sbFormatString.toString();
				totalLength = GetCJKStringLength(unformatString);//重新計算長度
			} 
			if (totalLength >= paddingLength) return unformatString;
			else return PadRight(unformatString + paddingChar, paddingLength, paddingChar);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return unformatString;
	}
	
	public static int GetCJKStringLength(String inputString) {
		int charLength = 0;
		try {
			if (!(inputString == null || "".equals(inputString))) {
				//計算字元長度
				char[] chars = inputString.toCharArray();
				for (int i = 0; i < chars.length; i++) {
					int intUtf32 = 0;
					if (Character.isHighSurrogate(chars[i])) {
						if (Character.isSurrogatePair(chars[i], chars[i + 1])) {
							intUtf32 = Character.toCodePoint(chars[i], chars[i + 1]);
						}
					}//end of if
					Character oneChar = chars[i];
					//根據Unicode 5.0版編碼，要準確的判斷一個中文字符要包括
					if ((oneChar >= 0x4E00 && oneChar <= 0x9FFF)//(CJK基本4E00-9FFF)
	                        || (oneChar >= 0x2E80 && oneChar <= 0x2EFF)//CJK部首擴充
	                        || (oneChar >= 0x2F00 && oneChar <= 0x2FDF)//CJK康熙部首
	                        || (oneChar >= 0x3000 && oneChar <= 0x303F)//CJK符號和標點
	                        || (oneChar >= 0x31C0 && oneChar <= 0x31EF)//CJK筆劃
	                        || (oneChar >= 0x3200 && oneChar <= 0x32FF)//封閉式CJK文字和月份
	                        || (oneChar >= 0x3300 && oneChar <= 0x33FF)//CJK兼容
	                        || (oneChar >= 0x3400 && oneChar <= 0x4DBF)//CJK擴充A
	                        || (intUtf32 >= 0x20000 && intUtf32 <= 0x2A6D6)//CJK擴充B
		                    || (intUtf32 >= 0x2A700 && intUtf32 <= 0x2B73F)//CJK擴充C
		                    || (intUtf32 >= 0x2B740 && intUtf32 <= 0x2B81F)//CJK擴充D
		                    || (intUtf32 >= 0x2B820 && intUtf32 <= 0x2F7FF)//CJK擴充E
		                    || (intUtf32 >= 0x2F800 && intUtf32 <= 0x2FA1F)//CJK擴充B來自台灣的542個相容漢字
	                        || (oneChar >= 0x4DC0 && oneChar <= 0x4DFF)//易經六十四卦符號
	                        || (oneChar >= 0x4E00 && oneChar <= 0x9FBF)//CJK統一表意符號
	                        || (oneChar >= 0xF900 && oneChar <= 0xFAFF)//CJK兼容象形文字
	                        || (oneChar >= 0xFE30 && oneChar <= 0xFE4F)//CJK兼容形式
	                        || (oneChar >= 0xFF00 && oneChar <= 0xFFEF)//全角ASCII、全角標點
	                        || (oneChar >= 0xE000 && oneChar <= 0xF8FF)//私人專用區 (E000-F8FF)
	                        || oneChar.toString().getBytes("UTF-8").length != 1) {//其他非ASCII碼
						if (intUtf32 > 0) {
		                    i++;//因多取1個字元故再加1
		                }
						charLength += 2;//中文以長度2計算
	        		} else {
	        			charLength++;
	        		}//end of if
				}//end of for
			}//end of if
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return charLength;
	}
	
//	public static String GetCJKString(String inputString) {
////		int charLength = 0;
//		StringBuffer sb = new StringBuffer(); 
//		int rowStrCount = 0;
//		try {
//			if (!(inputString == null || "".equals(inputString))) {
//				//計算字元長度
//				char[] chars = inputString.toCharArray();
//				for (int i = 0; i < chars.length; i++) {
//					int intUtf32 = 0;
//					if (Character.isHighSurrogate(chars[i])) {
//						if (Character.isSurrogatePair(chars[i], chars[i + 1])) {
//							intUtf32 = Character.toCodePoint(chars[i], chars[i + 1]);
//						}
//					}//end of if
//					Character oneChar = chars[i];
//					//根據Unicode 5.0版編碼，要準確的判斷一個中文字符要包括
//					if ((oneChar >= 0x4E00 && oneChar <= 0x9FFF)//(CJK基本4E00-9FFF)
//	                        || (oneChar >= 0x2E80 && oneChar <= 0x2EFF)//CJK部首擴充
//	                        || (oneChar >= 0x2F00 && oneChar <= 0x2FDF)//CJK康熙部首
//	                        || (oneChar >= 0x3000 && oneChar <= 0x303F)//CJK符號和標點
//	                        || (oneChar >= 0x31C0 && oneChar <= 0x31EF)//CJK筆劃
//	                        || (oneChar >= 0x3200 && oneChar <= 0x32FF)//封閉式CJK文字和月份
//	                        || (oneChar >= 0x3300 && oneChar <= 0x33FF)//CJK兼容
//	                        || (oneChar >= 0x3400 && oneChar <= 0x4DBF)//CJK擴充A
//	                        || (intUtf32 >= 0x20000 && intUtf32 <= 0x2A6D6)//CJK擴充B
//		                    || (intUtf32 >= 0x2A700 && intUtf32 <= 0x2B73F)//CJK擴充C
//		                    || (intUtf32 >= 0x2B740 && intUtf32 <= 0x2B81F)//CJK擴充D
//		                    || (intUtf32 >= 0x2B820 && intUtf32 <= 0x2F7FF)//CJK擴充E
//		                    || (intUtf32 >= 0x2F800 && intUtf32 <= 0x2FA1F)//CJK擴充B來自台灣的542個相容漢字
//	                        || (oneChar >= 0x4DC0 && oneChar <= 0x4DFF)//易經六十四卦符號
//	                        || (oneChar >= 0x4E00 && oneChar <= 0x9FBF)//CJK統一表意符號
//	                        || (oneChar >= 0xF900 && oneChar <= 0xFAFF)//CJK兼容象形文字
//	                        || (oneChar >= 0xFE30 && oneChar <= 0xFE4F)//CJK兼容形式
//	                        || (oneChar >= 0xFF00 && oneChar <= 0xFFEF)//全角ASCII、全角標點
//	                        || (oneChar >= 0xE000 && oneChar <= 0xF8FF)//私人專用區 (E000-F8FF)
//	                        || oneChar.toString().getBytes("UTF-8").length != 1) {//其他非ASCII碼
//						if (intUtf32 > 0) {
//		                    i++;//因多取1個字元故再加1
//		                }
//						if (rowStrCount + 2 > 32) {
//							rowStrCount = 0;
//							sb.append("\r\n");
//						}
//						rowStrCount += 2;//中文以長度2計算
//					} else {
//						
//						/**
//						 * 一行最多16中文 or 32英數,字數超過換行
//						 * 明細剛好一行就不必換行
//						 * 
//						 * 107/01/24
//						 * 為避免 \ & " 不在同一行,造成錯誤 
//						 */
//						if ((rowStrCount == 32 && i != chars.length) || (rowStrCount + 1 == 32 && '\\' == oneChar)) {
//							rowStrCount = 0;
//							sb.append("\r\n");
//						}
//						rowStrCount++;
//					}//end of if
//					sb.append(oneChar);
//				}//end of for
//				sb.append(" \r\n");
//			}//end of if
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		return sb.toString();
//	}
	
	public static String GetCJKString(String inputString) {
		StringBuffer sb = new StringBuffer();
		inputString = fullWidth2halfWidth(inputString);
		double oneRowTotal = 0;
		for (char cha : inputString.toCharArray()) {
			double i = StringUtil.checkChar(cha);

			if (oneRowTotal + i > 28) {
				sb.append("\r\n");
				oneRowTotal = i;
			} else {
				oneRowTotal = oneRowTotal + i;
			}
			sb.append(cha);

		}
		sb.append("\r\n");
		return sb.toString();
	}
	
	public static void main(String[] at) throws Exception{
//		String text[] = "1我, aAＡ１　，&＆ 【";
		String[] text = new String[]{
				"一二三四五六七八九十一二三四五六七八九十",
				"1234567890123456789012345678901234567890",
				"12345678901234567890123456789012",
				"一二三四五六七八九十一二三四",
				"一二三四五六七八九十一二三四五六",
				"************************************",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEF",
				"abcdefghijklmnopqrstuvwxyzabcdef",
				"ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ",
				"ａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚ",
				"＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊",
				"車身:RKTGK5880KF101849引擎:L15Z45601810"
				,"	v@＠",
				"\"車身\":RKTGK5880KF101849引擎:L15Z45601810",
				"\"車身\":RKTGK5880KF101849引擎:L15Z45601810".replaceAll("\"", "\\\\\""),
				"\\\"車身\\\":RKTGK5880KF101849引擎:L15Z45601810"
		};
		for(String i :text){
			System.out.println(StringUtil.GetCJKString(i));
			System.out.println();
		}
		
	}

	private static boolean isSymbol(String str) {
		Pattern patPunc = Pattern.compile("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]$");
		Matcher matcher = patPunc.matcher(str);
		return matcher.find();
	}
	 
	
	/**
     * 全形字串轉換半形字串
     * 
     * @param fullWidthStr
     *            非空的全形字串
     * @return 半形字串
     */
    private static String fullWidth2halfWidth(String fullWidthStr) {
        if (null == fullWidthStr || fullWidthStr.length() <= 0) {
            return "";
        }
        char[] charArray = fullWidthStr.toCharArray();
        //對全形字元轉換的char陣列遍歷
        for (int i = 0; i < charArray.length; i++) {
            int charIntValue = (int) charArray[i];
            //如果符合轉換關係,將對應下標之間減掉偏移量65248;如果是空格的話,直接做轉換
            if (charIntValue >= 65281 && charIntValue <= 65374) {
                charArray[i] = (char) (charIntValue - 65248);
            } else if (charIntValue == 12288) {
                charArray[i] = (char) 32;
            }
        }
        return new String(charArray);
    }

    /**
     * 列印發票
     * 計算一行字數
     *
     * @param character
     * @return
     */
	public static double checkChar(char c) {
		if (Character.isUpperCase(c)) {
			return 1.16;
		} else if (Character.isLowerCase(c) 
				|| Character.isDigit(c) 
				|| Character.isWhitespace(c) 
				|| StringUtil.isSymbol(String.valueOf(c))) {
			return 1;
		} else {
			return 1.75;
		}

	}
    	
    	
	
	/**
     * 身分證字號檢查程式，身分證字號規則：
     * 字母(ABCDEFGHJKLMNPQRSTUVXYWZIO)對應一組數(10~35)，
     * 令其十位數為X1，個位數為X2；( 如Ａ：X1=1 , X2=0 )；D表示2~9數字
     * Y = X1 + 9*X2 + 8*D1 + 7*D2 + 6*D3 + 5*D4 + 4*D5 + 3*D6 + 2*D7+ 1*D8 + D9
     * 如Y能被10整除，則表示該身分證號碼為正確，否則為錯誤。
     * 臺北市(A)、臺中市(B)、基隆市(C)、臺南市(D)、高雄市(E)、臺北縣(F)、
     * 宜蘭縣(G)、桃園縣(H)、嘉義市(I)、新竹縣(J)、苗栗縣(K)、臺中縣(L)、
     * 南投縣(M)、彰化縣(N)、新竹市(O)、雲林縣(P)、嘉義縣(Q)、臺南縣(R)、
     * 高雄縣(S)、屏東縣(T)、花蓮縣(U)、臺東縣(V)、金門縣(W)、澎湖縣(X)、
     * 陽明山(Y)、連江縣(Z)
     * @since 2006/07/19
     */
    public static boolean isValidTWPID(String twpid) {
      boolean result = false;
      String pattern = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
      if (TWPID_PATTERN.matcher(twpid.toUpperCase()).matches()) {
        int code = pattern.indexOf(twpid.toUpperCase().charAt(0)) + 10;
        int sum = 0;
        sum = (int) (code / 10) + 9 * (code % 10) + 8 * (twpid.charAt(1) - '0')
            + 7 * (twpid.charAt(2) - '0') + 6 * (twpid.charAt(3) - '0')
            + 5 * (twpid.charAt(4) - '0') + 4 * (twpid.charAt(5) - '0')
            + 3 * (twpid.charAt(6) - '0') + 2 * (twpid.charAt(7) - '0')
            + 1 * (twpid.charAt(8) - '0') + (twpid.charAt(9) - '0');
        if ( (sum % 10) == 0) {
          result = true;
        }
      }
      return result;
    }
    
    /**
     * 營利事業統一編號檢查程式
     * 可至 http://www.etax.nat.gov.tw/ 查詢營業登記資料
     * @since 2006/07/19
     */
    public static boolean isValidTWBID(String twbid) {
      boolean result = false;
      String weight = "12121241";
      boolean type2 = false; //第七個數是否為七
      if (TWBID_PATTERN.matcher(twbid).matches()) {
        int tmp = 0, sum = 0;
        for (int i = 0; i < 8; i++) {
          tmp = (twbid.charAt(i) - '0') * (weight.charAt(i) - '0');
          sum += (int) (tmp / 10) + (tmp % 10); //取出十位數和個位數相加
          if (i == 6 && twbid.charAt(i) == '7') {
            type2 = true;
          }
        }
        if (type2) {
          if ( (sum % 10) == 0 || ( (sum + 1) % 10) == 0) { //如果第七位數為7
            result = true;
          }
        } else {
          if ( (sum % 10) == 0) {
            result = true;
          }
        }
      }
      return result;
    }
    /**
     * 檢查是否有中文
     * @param value
     * @return
     */
    public static boolean hasChinese(String value){
        for(int i = 0; i < value.length(); i++){
            if(0 + value.charAt(i) > 0x80){
                return true;
            }
        }
        return false;
    }
    /**
     * 檢查輸入格式是否為整數
     * @param num 輸入欄位的值
     * @return true-格式正確, false-格式錯誤
     */
    public static boolean isInteger(String num){
    	try{
    		Integer.parseInt(num);
    	}catch(Exception e){
    		return false;
    	}
    	return true;
    }
    
    /**
     * 檢查輸入格式是否為boolean
     * @param s 輸入欄位的值
     * @return true-格式正確, false-格式錯誤
     */
    public static boolean isBoolean(String s){
    	try{
    		Boolean.parseBoolean(s);
    	}catch(Exception e){
    		return false;
    	}
    	return true;
    }
    
    /**
     * Email格式檢查
     * @param data
     * @return
     */
    public static boolean isValidEmail(String data){
    	return EMAIL_PATTERN.matcher(data).matches();
    }
    
    public static String double2Str(Double d){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat("#.####");
    	return df.format(d.doubleValue());
    }
    
    public static String double2DgfStr(Double d){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat("0.##");
    	return df.format(d.doubleValue());
    }
    
    public static String double2DgfStr(String dd){
    	try{
    		Double d = new Double(dd);
    		if(d == null)return "0";
        	DecimalFormat df = new DecimalFormat("0.##");
        	return df.format(d.doubleValue());
    	}catch(Exception e){
    		return "0";
    	}
    }
    
    public static String int2Str(Integer i){
    	if(i == null || i==0){
    		return "";
    	}else{
    		return i.toString();
    	}
    }
    /**
     * 格式化Integer
     * @param d
     * @return
     */
    public static String formatInt(Integer d){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat("#,###");
    	return df.format(d.intValue());
    }
    
    /**
     * 格式化Long
     * @param d
     * @return
     */
    public static String formatLong(Long d){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat("#,###");
    	return df.format(d.longValue());
    }
    
    
    /**
     * 格式化Double
     * @param d
     * @return
     */
    public static String formatDouble(Double d){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat("#,###.######");
    	return df.format(d.doubleValue());
    }
    
    /**
     * 格式化Double, 可指定數字樣式
     * 若輸入值為null 回傳0
     * @param d
     * @return
     */
    public static String formatDoubleWithZero(Double d, String format){
    	if(d == null)return "0";
    	DecimalFormat df = new DecimalFormat(format);
    	return df.format(d.doubleValue());
    }
    
    public static Double str2Double(String d){
    	try{
    		return new Double(d);
    	}catch(Exception e){
    		return new Double(0);
    	}
    }
    public static Short str2Short(String d){
    	try{
    		return new Short(d);
    	}catch(Exception e){
    		return new Short("0");
    	}
    }
    public static Integer str2Integer(String d){
    	try{
    		return new Integer(d);
    	}catch(Exception e){
    		return new Integer(0);
    	}
    }
    
    public static Long str2Long(String d){
    	try{
    		return new Long(d);
    	}catch(Exception e){
    		return new Long(0);
    	}
    }
    
    /**
     * 提供精確的小數位四捨五入處理。
     * @param v 需要四捨五入的數位
     * @param scale 小數點後保留幾位
     * @return 四捨五入後的結果
     */
    public static double round(double v,int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    /**
     * 阿拉伯數字轉國字
     * @param num
     * @return
     */
    public static String convertNum2Chin(long num){
    	String integer = num + "";

	    char[] NTD_NUMS = "零壹貳參肆伍陸柒捌玖".toCharArray();   
	    String[] U1 = {"", "拾", "佰", "仟"};   
	    String[] U2 = {"", "萬", "億"};
	    if (integer.equals("0")) { 
        	return String.valueOf(NTD_NUMS[0]);
        }
	    
        StringBuilder buffer = new StringBuilder();   
        // 從個位數開始轉換   
        int i, j;   
        for (i = integer.length() - 1, j = 0; i >= 0; i--, j++) {   
            char n = integer.charAt(i);   
            if (n == '0') {   
                // 當n是0且n的右邊一位不是0時，插入[零]   
                if (i < integer.length() - 1 && integer.charAt(i + 1) != '0') {   
                    buffer.append(NTD_NUMS[0]);   
                }   
                // 插入[萬]或者[億]   
                if (j % 4 == 0) {   
                    if (i > 0 && integer.charAt(i - 1) != '0'  
                            || i > 1 && integer.charAt(i - 2) != '0'  
                            || i > 2 && integer.charAt(i - 3) != '0') {   
                        buffer.append(U2[j / 4]);   
                    }   
                }   
            } else {   
                if (j % 4 == 0) {   
                    buffer.append(U2[j / 4]);     // 插入[萬]或者[億]   
                }   
                buffer.append(U1[j % 4]);         // 插入[拾]、[佰]或[仟]   
                buffer.append(NTD_NUMS[n - '0']); // 插入數字   
            }   
        }   
        return buffer.reverse().toString();   
    }
    
    
	
    /**
     * 產生UUID(大寫)
     * @return
     */
    public static String uuid(){
    	return UUID.randomUUID().toString().toUpperCase();
    }
    
    public static String contentType(String returnFileName){  
        String contentType = "application/octet-stream";  
        if (returnFileName.lastIndexOf(".") < 0)  
            return contentType;  
        returnFileName = returnFileName.toLowerCase();  
        returnFileName = returnFileName.substring(returnFileName.lastIndexOf(".")+1);  
          
        if (returnFileName.equals("html") || returnFileName.equals("htm") || returnFileName.equals("shtml")){  
            contentType = "text/html";  
        } else if (returnFileName.equals("css")){  
            contentType = "text/css";  
        } else if (returnFileName.equals("xml")){  
            contentType = "text/xml";  
        } else if (returnFileName.equals("gif")){  
            contentType = "image/gif";  
        } else if (returnFileName.equals("jpeg") || returnFileName.equals("jpg")){  
            contentType = "image/jpeg";  
        } else if (returnFileName.equals("js")){  
            contentType = "application/x-javascript";  
        } else if (returnFileName.equals("atom")){  
            contentType = "application/atom+xml";  
        } else if (returnFileName.equals("rss")){  
            contentType = "application/rss+xml";  
        } else if (returnFileName.equals("mml")){  
            contentType = "text/mathml";   
        } else if (returnFileName.equals("txt")){  
            contentType = "text/plain";  
        } else if (returnFileName.equals("jad")){  
            contentType = "text/vnd.sun.j2me.app-descriptor";  
        } else if (returnFileName.equals("wml")){  
            contentType = "text/vnd.wap.wml";  
        } else if (returnFileName.equals("htc")){  
            contentType = "text/x-component";  
        } else if (returnFileName.equals("png")){  
            contentType = "image/png";  
        } else if (returnFileName.equals("tif") || returnFileName.equals("tiff")){  
            contentType = "image/tiff";  
        } else if (returnFileName.equals("wbmp")){  
            contentType = "image/vnd.wap.wbmp";  
        } else if (returnFileName.equals("ico")){  
            contentType = "image/x-icon";  
        } else if (returnFileName.equals("jng")){  
            contentType = "image/x-jng";  
        } else if (returnFileName.equals("bmp")){  
            contentType = "image/x-ms-bmp";  
        } else if (returnFileName.equals("svg")){  
            contentType = "image/svg+xml";  
        } else if (returnFileName.equals("jar") || returnFileName.equals("var") || returnFileName.equals("ear")){  
            contentType = "application/java-archive";  
        } else if (returnFileName.equals("doc") || returnFileName.equals("docx")){  
            contentType = "application/msword";  
        } else if (returnFileName.equals("pdf")){  
            contentType = "application/pdf";  
        } else if (returnFileName.equals("rtf")){  
            contentType = "application/rtf";  
        } else if (returnFileName.equals("xls") || returnFileName.equals("xlsx")){  
            contentType = "application/vnd.ms-excel";   
        } else if (returnFileName.equals("ppt") || returnFileName.equals("pptx")){  
            contentType = "application/vnd.ms-powerpoint";  
        } else if (returnFileName.equals("7z")){  
            contentType = "application/x-7z-compressed";  
        } else if (returnFileName.equals("rar")){  
            contentType = "application/x-rar-compressed";  
        } else if (returnFileName.equals("swf")){  
            contentType = "application/x-shockwave-flash";  
        } else if (returnFileName.equals("rpm")){  
            contentType = "application/x-redhat-package-manager";  
        } else if (returnFileName.equals("der") || returnFileName.equals("pem") || returnFileName.equals("crt")){  
            contentType = "application/x-x509-ca-cert";  
        } else if (returnFileName.equals("xhtml")){  
            contentType = "application/xhtml+xml";  
        } else if (returnFileName.equals("zip")){  
            contentType = "application/zip";  
        } else if (returnFileName.equals("mid") || returnFileName.equals("midi") || returnFileName.equals("kar")){  
            contentType = "audio/midi";  
        } else if (returnFileName.equals("mp3")){  
            contentType = "audio/mpeg";  
        } else if (returnFileName.equals("ogg")){  
            contentType = "audio/ogg";  
        } else if (returnFileName.equals("m4a")){  
            contentType = "audio/x-m4a";  
        } else if (returnFileName.equals("ra")){  
            contentType = "audio/x-realaudio";  
        } else if (returnFileName.equals("3gpp") || returnFileName.equals("3gp")){  
            contentType = "video/3gpp";  
        } else if (returnFileName.equals("mp4") ){  
            contentType = "video/mp4";  
        } else if (returnFileName.equals("mpeg") || returnFileName.equals("mpg") ){  
            contentType = "video/mpeg";  
        } else if (returnFileName.equals("mov")){  
            contentType = "video/quicktime";  
        } else if (returnFileName.equals("flv")){  
            contentType = "video/x-flv";  
        } else if (returnFileName.equals("m4v")){  
            contentType = "video/x-m4v";  
        } else if (returnFileName.equals("mng")){  
            contentType = "video/x-mng";  
        } else if (returnFileName.equals("asx") || returnFileName.equals("asf")){  
            contentType = "video/x-ms-asf";  
        } else if (returnFileName.equals("wmv")){  
            contentType = "video/x-ms-wmv";  
        } else if (returnFileName.equals("avi")){  
            contentType = "video/x-msvideo";  
        }  
          
        return contentType;  
    }  
    
    
    public static boolean isInnerIP(String ipAddress){    
        boolean isInnerIp = false;    
        long ipNum = getIpNum(ipAddress);    
        /**   
         ** 私有IP：A类  10.0.0.0-10.255.255.255   
         ** B类  172.16.0.0-172.31.255.255   
         ** C类  192.168.0.0-192.168.255.255   
         ** 当然，还有127这个网段是环回地址   
        **/   
        long aBegin = getIpNum("10.0.0.0");    
        long aEnd = getIpNum("10.255.255.255");    
        long bBegin = getIpNum("172.16.0.0");    
        long bEnd = getIpNum("172.31.255.255");    
        long cBegin = getIpNum("192.168.0.0");    
        long cEnd = getIpNum("192.168.255.255");    
        isInnerIp = isInner(ipNum,aBegin,aEnd) || isInner(ipNum,bBegin,bEnd) || isInner(ipNum,cBegin,cEnd) || ipAddress.equals("127.0.0.1");    
        return isInnerIp;               
	}   
    
    private static long getIpNum(String ipAddress) {    
        String [] ip = ipAddress.split("\\.");    
        long a = Integer.parseInt(ip[0]);    
        long b = Integer.parseInt(ip[1]);    
        long c = Integer.parseInt(ip[2]);    
        long d = Integer.parseInt(ip[3]);    
       
        long ipNum = a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;    
        return ipNum;    
    }   
    
    private static boolean isInner(long userIp,long begin,long end){    
        return (userIp>=begin) && (userIp<=end);    
    }   
    
    /**
     * 將空字串轉成null
     * @param ss
     * @return
     */
    public static String emptyNull(String ss){
    	String s = null;
    	if(!notNull(ss).equals("")){
    		s = ss;
    	}
    	return s;
    }
    
    /**
     * 以byte長度取回長度
     * @param s - 原始字串
     * @return
     */    
    public static int getStringSize(String s){
    	s = notNull(s);
    	byte[] b = s.getBytes();    	
    	return b.length;
    }
    
    /**
     * 斷行
     * @param 行數
     * @return
     */    
    public static String addLine(int i){
    	String n = "";
		for(int k=0; k<i; k++){
			n +="\n";
		}	
    	return n;
    }
    /**
     * 二進位制轉字串
     * @param b
     * @return
     */
    public static String byte2hex(byte[] b) {
	    String hs="";
	    String stmp="";
	    for (int n=0;n < b.length;n++)
	    {
	    stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
	    if (stmp.length()==1) hs=hs+"0"+stmp;
	    else hs=hs+stmp;
	    }
	    return hs.toUpperCase();
    }
    /**
     * SHA-1加密
     * @param info
     * @return
     */
    public static String hashSHA_1Str(String info) {
    	String re = null;
    	try {
	    	String myinfo=info;
	
	    	MessageDigest alga=MessageDigest.getInstance("SHA-1");
	    	alga.update(myinfo.getBytes());
	    	byte[] digesta=alga.digest();
	    	re = byte2hex(digesta);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return re;
	}
    /**
     * SHA-1加密
     * @param info
     * @return
     */
    public static byte[] hashSHA_1Byte(String info) {
    	String re = null;
    	try {
	    	String myinfo=info;
	    	MessageDigest alga=MessageDigest.getInstance("SHA-1");
	    	alga.update(myinfo.getBytes());
	    	return  alga.digest();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
	}
    /**
     * 取得本機IP
     * @return
     */
    public static String hostIp(){
    	try{
	    	InetAddress myComputer = InetAddress.getLocalHost() ;
	    	return myComputer.getHostAddress();
    	}catch(Exception e){
    		return "";
    	}
    }
    
    public static String isRightFormatS(String overfivememo){
		//System.out.println("1");
		String result = "";
		
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd");
		Date myDate = new Date();
        String today = formatter.format(myDate);
        int intyear = Integer.parseInt(today.substring(0, 4)) - 1911;
        String year = String.valueOf(intyear);
       	if(year!=null && !year.equals("")) year = new DecimalFormat("000").format(Integer.parseInt(year));
        
       	String indexStr = "高市財政五字第"+year.trim();
       	//String indexStr = "高市財政五字第"+year.trim();
        
        int findidx = overfivememo.indexOf(indexStr);
		
		if(findidx!=-1)
		{
			//System.out.println("2");
			byte[] bytearray =  overfivememo.getBytes();
			
			int Index1 = bytearray[0];
			int Index2 = bytearray[1];
			int Index3 = bytearray[2];
			//int Index4 = bytearray[3];
			
			//System.out.println(Integer.toString(Index1));
			//System.out.println(Integer.toString(Index2));
			//System.out.println(Integer.toString(Index3));
			//System.out.println(Integer.toString(Index4));
			
			if(Index1 >= 65 && Index1 <= 90 && Index2 >= 65 && Index2 <= 90 && Index3 >= 48 && Index3 <= 57)
			{
				//System.out.println("3");
				result = overfivememo.substring(2, 9);
				//result = true;
			}	
			
		}
	
		return result;
			
	}
    
    /**
     * 非 Null 字串與空字串
     * @param value
     * @return
     */
    public static boolean isNotNullEmpty(String value){
    	if(value ==null || "".equals(value)  || "null".equals(value) ){
    		return false;
    	}else{
    		return true;
    	}
    }
    
    public static String escapSql(String sql){
    	return sql.replaceAll("--", "").replaceAll(";", "");
    }
    
    /**
	 * 搜尋指定字串, 並在指定字串開頭前加入新的字串
	 * @param input 被搜尋的字串
	 * @param oldValue 要搜尋指定字串 
	 * @param newValue 要加入的字串
	 * @return
	 */
    public static String replaceLastStr(String input, String oldValue, String newValue){
       int index = input.lastIndexOf(oldValue);
		if(index < 0){
			return input;
		}else{
			StringBuffer sb = new StringBuffer();
			sb.append(input.substring(0, index));
			sb.append(newValue);			
			sb.append(input.substring(index + oldValue.length(), input.length()));
			return sb.toString();
		}
	}
    
    public static Short toShort(Object s){
    	String v = ""; 
    	try{
    		v = notNull(s);
    		return new Short(v);
    	}catch(Exception e){
    		return 0;
    	}
    }
    
    /**
	 * add the char to the length that you want.
	 * 
	 * @param sData
	 *            The original string.
	 * @param iStrLength
	 *            The length that you want to have.
	 * @param sReplaceChar
	 *            The replace char.
	 * @param PadMode
	 *            "L" : add char to Left "R" : add char to Right
	 * @return The String that had add char.
	 */
	public static String rtnPadStr(String sData, int iStrLength,
			String sReplaceChar, String PadMode) {
		sData = (sData == null) ? "" : sData;
		String sPadStr = "";
		if (sData.length() < iStrLength) {
			for (int i = sData.length(); i < iStrLength; i++) {
				sPadStr += sReplaceChar;
			}
			if (PadMode.equals("L")) {
				sData = sPadStr + sData;
			} else {
				sData = sData + sPadStr;
			}
		}
		return sData;
	}
	
	/**
	 * 檢核EMAIL尾端是否為@,是則截掉
	 * @param str
	 * @return
	 */
	public static String detectionEMAILTail(String emailaddr){
		emailaddr = StringUtil.notNull(emailaddr);
		if(emailaddr.length() > 0){
			String tailchar =  emailaddr.substring(emailaddr.length() - 1);
			if("@".equals(tailchar)){
				emailaddr = emailaddr.substring(0, emailaddr.length() - 1);
			}
		}
		return emailaddr;
	}
	
	/**
	 * 檢查字串不包含亂碼
	 * @param code
	 * @return
	 */
	public static boolean chkDecode(String code) {
		boolean result=true;
		byte[] bytecode = code.getBytes();
		for (int i=0;i<bytecode.length;i++) {
			if(bytecode[i] >= 0x7a || bytecode[i] < 0x30) {
				result=false;
				break;
			}
		}
		return result;
	}
	
	/**
	 * long 轉成 BigDecimal
	 * @param d
	 * @return
	 */
    public static BigDecimal long2BigDecimal(long d){
    	try{
    		return new BigDecimal(d);
    	}catch(Exception e){
    		return BigDecimal.ZERO;
    	}
    }	
	
    /**
     * 取得數字整數位數 add 2018/01/02
     * @param target
     * @return
     */
    public static int getIntegerBits(String target) {
		if(0.0 == Double.parseDouble(target) % 1){
			return 0;
		} else {
			return target.indexOf('.');
		}
	}
    
    /**
     * 取得數字小數位數 add 2018/01/02
     * @param target
     * @return
     */
    public static int getDecimalBits(String target) {
		if(0.0 == Double.parseDouble(target) % 1){
			return 0;
		} else {
			// 防呆, SQL Server 會自動補零導致小數5位
			target = String.valueOf(Double.parseDouble(target));
			return target.length() - target.indexOf('.') - 1;
		}
	}
    
	public static BigDecimal bigDecimalNotNull(BigDecimal value) {
		if (value == null) {
			return BigDecimal.ZERO;
		}
		return value;
	}
	
	/**
	 * 將字串陣列內數值轉換為文字，並以符號區隔
	 * @param array			(String陣列)
	 * @param separation	(區隔符號)
	 * @return
	 */
	public static String getStringFromArray(Object[] array, String separation) {
		StringBuilder sb = new StringBuilder("");
		
		if (array instanceof java.lang.String[]) {
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i]);

				if (i < (array.length-1))
					sb.append(separation);
			}
		}
		return sb.toString();
	}

	/**
	 * 遮蓋手機號碼 - 中獎通知LOG用
	 * @param src
	 * @return
	 */
	public static String coverPhoneNumber(String src){
		String des = "";
		try{
			des = src.substring(0,4) + "****" + src.substring(src.length() - 3);
		}catch(Exception e){
			des = "coverFail";
		}
		return des;
	}
}
