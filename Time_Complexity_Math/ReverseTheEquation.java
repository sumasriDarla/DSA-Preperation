// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        // your code here
        List<String> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for(char c:S.toCharArray()){
            if(Character.isDigit(c)){
                number.append(c);
            }else{
                numbers.add(number.toString());
                number.setLength(0);
                operators.add(c);
            }
        }
        numbers.add(number.toString());
        Collections.reverse(numbers);
        Collections.reverse(operators);
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<operators.size();i++){
            result.append(numbers.get(i));
            result.append(operators.get(i));
        }
        result.append(numbers.get(numbers.size()-1));
        return result.toString();   
    }
}
