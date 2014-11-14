package week1

// Monads -> parametric type M[T] with 2 operations
// flatMap && unit

// trait M[T] {
//	def flatMap[U](f: T => M[U]): M[U]
//}

// flatMap also called bind

// def unit[T](x: T): M[T]

// List is monad with unit(x) = List(x)
// Set is  monad with unit(x) = Set(x)
// Option is monad with unit(x) = Some(x)
// Generator is monad with unit(x) = single(x)
// flatMap is an operation on each of these types
// unit is defferent for each of monads

// map can be defined for monad as combination of flatMap & unit
// m map f == m flatMap (x => unit(f(x)))
//				 == m flatMap (f andThen unit)

// MONAD LAWS
// 1. Associavity:
// (m flatMap f) flatMap g == m flatMap ( (x => flatMap f(x) flatMap g) )
// 2. Left unit
// unit(x) flatMap f == f(x)
// Right unit
// m flatMap unit = m


object monads_session {
	println("xx")                             //> xx
}