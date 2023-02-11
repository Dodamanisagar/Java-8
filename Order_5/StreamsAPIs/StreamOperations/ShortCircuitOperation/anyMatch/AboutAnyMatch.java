package Order_5.StreamsAPIs.StreamOperations.ShortCircuitOperation.anyMatch;

public class AboutAnyMatch {
    /**Java Stream anyMatch(predicate) is a terminal short-circuit operation. It is used to check if the Stream contains at least one element that satisfies the given predicate.
     * Syntax:-boolean anyMatch(Predicate<? super T> predicate)
              -Here predicate a non-interfering, stateless Predicate to apply to elements of the stream.
              -The anyMatch() method returns true if at least one element satisfies the condition provided by predicate, else false.
     *Description:-It is a short-circuiting terminal operation.
                  -It returns whether any elements of this stream match the provided predicate.
                  - May not evaluate the predicate on all elements if not necessary for determining the result. Method returns true as soon as first matching element is encountered.
                  - If the stream is empty then false is returned and the predicate is not evaluated.
                  - The difference between allMatch() and anyMatch() is that anyMatch() returns true if any of the elements in a stream matches the given predicate. When using allMatch(), all the elements must match the given predicate.
     *Difference between anyMatch() vs contains():-Theoretically, there is no difference between anyMatch() and contains() when we want to check if an element exists in a List.
                                                  -In some cases, parallelism feature of Streams may bring an advantage for really large lists, but we should not casually use the Stream.parallel() every time assuming that it may make things faster.
                                                  -In fact, invoking parallel() may bring down the performance for small streams.
     *Conclusion:-The anyMatch() method can be useful in certain cases where we need to check if there is at least one element in the stream.
                 -The shorter version list.contains() also does the same thing and can be used instead.*/
}
