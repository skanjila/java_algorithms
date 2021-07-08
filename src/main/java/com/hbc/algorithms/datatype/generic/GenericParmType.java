package com.hbc.algorithms.datatype.generic;

/** A generic data type that gets leveraged by some of the other
 * datastructures like Arrays and linkedlists
 * @param <T>
 */
public class GenericParmType<T>
{
    // An object of type T is declared
    T obj;
    GenericParmType(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}
