/**
 * Demonstrates the variants of generics in Java. The code is written by refering to 'Java: A Beginner's Guide' by Schildt. The examples aren't the best available but suffice the purpose :)
 * Wherever I found their examples confusing, I created my own.
 * 
 * 
 * Background:
 * The primary objective of introducing generics was to ensure <b>type safety</b> type safety, thereby, <b>avoiding ClassCastException</b>. By this rationale:
 * 1) Generics are <b>only applied for reference types</b>
 * 2) Type safety is ensured at compile-time, hence, the compiler removes the generic type information and substitutes the necessary casts. This process is known as erasure.
 * 3) Think of the parameters as the constructor arguments required to create an instance/object of the type parameterized class.
 */
/**
 * @author p950ojb
 *
 */
package com.generics;