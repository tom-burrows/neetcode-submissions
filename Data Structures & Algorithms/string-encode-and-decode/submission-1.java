class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        String encodedMessage = "";
        for (String str : strs) {
            String tempMessage = "";
            int length = str.length();
            tempMessage = length + "#" + str;
            encodedMessage += tempMessage;
        }
        return encodedMessage;
    }

    public List<String> decode(String str) {
        if (str == "") {
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        int position = 0;
        boolean processing = true;
        String substring = "";
        String numString = "";

        while (processing) {
            System.out.println(position);
            
            System.out.println("NumString: " + numString);
            if (str.charAt(position) == '#') {
                substring = str.substring(position+1, position+Integer.parseInt(numString)+1);
                System.out.println("SubString: "  + substring);
                result.add(substring);
                position += Integer.parseInt(numString)+1;
                numString = "";
            } else {
                numString = numString + str.charAt(position);
                position++;
            }

            if ( position == str.length()) {
                return result;
            }
        }
        
        return result;
    }
}
