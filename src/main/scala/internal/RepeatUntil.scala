package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */


  // define the new control-flow structure here

object RepeatUntil extends App {
  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)

  def repeat(body: => Unit):RepeatHelper  = new RepeatHelper(body);


  class RepeatHelper(body: =>Unit) {
    def until(b: =>Boolean) {
      while (!b) {
        body
      }
    }
  }
}

