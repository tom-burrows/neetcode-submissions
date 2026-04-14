class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        String age = "";
        for (int i = 0; i < details.length; i++) {
            age += details[i].charAt(11);
            age += details[i].charAt(12);
            System.out.println(age);
            int ageNum = Integer.parseInt(age);
            if ( ageNum > 60) {
                count++;
            }
            age = "";
        }
        return count;
    }
}