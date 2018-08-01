package com.xyzcorp

import org.scalatest.{FunSpec, Matchers}

class EmployeeSpec extends FunSpec with Matchers {

  describe("A Employee") {
    describe("A full name") {
      it("should have a combination of firstName and lastName") {
        val e = Employee("James", "Gosling")
        e.fullName should be ("James Gosling")
      }
    }
  }
}