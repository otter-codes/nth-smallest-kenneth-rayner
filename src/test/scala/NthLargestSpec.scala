import org.scalatest.{MustMatchers, WordSpec}

class NthLargestSpec extends WordSpec with MustMatchers {


  "NthLargest"  must {

    "given list (1,2,3,4,5) and int 2 return 4 being it the second largest number" in {

     NthLargest.findNthLargest(List(1,2,3,4,5),2) mustEqual 4
    }
    "given list (3,3,4,4,5,5) and int 3 return 4 being it the third largest number" in {

      NthLargest.findNthLargest(List(3,3,4,4,5,5),3) mustEqual 3
    }
    "intercept exception if given List (1,2) nd key 3" in {

     intercept[IllegalArgumentException]{ NthLargest.findNthLargest(List(1,2),3) }
    }
  }
}
