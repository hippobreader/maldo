    package cipher;


    public class CipherExample {
        public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        
        
        public static final int[] cipherpattern = {1, -2, 3, -4, 5, -6};

       
        public static String encryptData(String inputStr) {
            inputStr = inputStr.toLowerCase();
            
            String encryptStr = "";
            
            for (int i = 0; i < inputStr.length(); i++) {
                char currentChar = inputStr.charAt(i);
                if (ALPHABET.indexOf(currentChar) != -1) { 
                    int pos = ALPHABET.indexOf(currentChar);
                    
                  
                    int shiftKey = cipherpattern[i % cipherpattern.length];
                    int encryptPos = (pos + shiftKey) % 26;
                    
                    
                    if (encryptPos < 0) {
                        encryptPos = ALPHABET.length() + encryptPos;
                    }
                    
                    char encryptChar = ALPHABET.charAt(encryptPos);
                    encryptStr += encryptChar;
                } else {
                  
                    encryptStr += currentChar;
                }
            }
            return encryptStr;
        }

        
        public static String decryptData(String inputStr) {
            inputStr = inputStr.toLowerCase();
            
            String decryptStr = "";
            
            for (int i = 0; i < inputStr.length(); i++) {
                char currentChar = inputStr.charAt(i);
                if (ALPHABET.indexOf(currentChar) != -1) { 
                    int pos = ALPHABET.indexOf(currentChar);
                    
                    
                    int shiftKey = cipherpattern[i % cipherpattern.length];
                    int decryptPos = (pos - shiftKey) % 26;
                    
                 
                    if (decryptPos < 0) {
                        decryptPos = ALPHABET.length() + decryptPos;
                    }
                    
                    char decryptChar = ALPHABET.charAt(decryptPos);
                    decryptStr += decryptChar;
                } else {
                   
                    decryptStr += currentChar;
                }
            }
            return decryptStr;
        }


    }

    



