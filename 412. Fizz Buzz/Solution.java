class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int count = 1; count <= n; count++) {
            boolean isDivisibleBy3 = count % 3 == 0;
            boolean isDivisibleBy5 = count % 5 == 0;
            if (isDivisibleBy3 && isDivisibleBy5) answer.add("FizzBuzz");
            else if (isDivisibleBy3) answer.add("Fizz");
            else if (isDivisibleBy5) answer.add("Buzz");
            else answer.add(String.valueOf(count));
        }
        return answer;
    }
}
