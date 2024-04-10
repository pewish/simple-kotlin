// You are given an integer array deck. There is a deck of cards where every card has a unique integer. The integer on the ith card is deck[i].

// You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.

// You will do the following steps repeatedly until all cards are revealed:

/* Take the top card of the deck, reveal it, and take it out of the deck.
If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
If there are still unrevealed cards, go back to step 1. Otherwise, stop.
Return an ordering of the deck that would reveal the cards in increasing order. */

class Solution {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        deck.sort()
        val n = deck.size
        val result = IntArray(n)
        val queue = ArrayDeque<Int>()

        for (i in 0 until n) {
            queue.addLast(i)
        }

        for (card in deck) {
            result[queue.removeFirst()] = card
            if (queue.isNotEmpty()) {
                queue.addLast(queue.removeFirst())
            }
        }

        return result
    }

}
