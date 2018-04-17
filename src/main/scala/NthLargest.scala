object NthLargest {
  def findNthLargest(input: List[Int], key: Int): Int = {

    val input2 = input.distinct.sorted

    if (input.length  >= key && key >0) {

      input2(input2.length - key)

    } else {

      throw new IllegalArgumentException
    }
  }
}
