# Two Pointers
**When to use:** Sorted arrays/strings, opposite-end scans, dedup, partition, pair-sum.

**Core idea:** Maintain two indices that move based on comparison/constraint to avoid O(n^2).

**Templates**
*Opposite ends (sorted)*:
i = 0; j = n-1
while i < j:
if good(i,j): update ans, move one/both
elif need larger sum: i++
else: j--

*Fast/slow cycle detection*:
slow=head; fast=head
while fast && fast.next:
slow = slow.next
fast = fast.next.next
if slow==fast: cycle
**Pitfalls**
- Not proving movement makes progress (can loop forever)
- Forgetting stability requirements (when removing duplicates in-place)

**Practice set:** LC‑1, LC‑15, LC‑19, LC‑26, LC‑167
