package pl.metastack.metarx.reactive.propagate

trait Produce[T] {
  def produce(value: T)
  def :=(value: T) = produce(value)
}
