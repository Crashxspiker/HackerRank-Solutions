class Add {
  void add(int... nums) {
    int sum = 0;
    String op = "";
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      op += nums[i];
      op += i == nums.length - 1 ? "=" : "+";
    }
    
    System.out.printf("%s%d%n", op, sum);
  }
}