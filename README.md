# Unexpected Behavior of map() Function in Kotlin

This code demonstrates a common misconception about the `map()` function in Kotlin.  Many programmers assume `map()` modifies the original list, but it actually returns a *new* list with the transformed elements.  This example shows how this behavior can lead to unexpected results if not understood.

The `bug.kt` file contains the code showcasing the issue, while `bugSolution.kt` provides a corrected version illustrating how to modify the list in place if desired.

This repository is intended to help programmers understand this common Kotlin pitfall and write more robust code.