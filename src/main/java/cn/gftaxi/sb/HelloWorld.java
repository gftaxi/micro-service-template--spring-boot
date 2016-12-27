package cn.gftaxi.sb;

import tech.simter.Context;

/**
 * @author RJ
 */
public class HelloWorld {
  public static void main(String[] args) {
    Context.set("userId", 1L);
    System.out.println("Hello World! " + Context.get("userId"));
  }
}
