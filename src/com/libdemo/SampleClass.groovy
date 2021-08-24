#!/usr/bin/env groovy
package com.libdemo

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
