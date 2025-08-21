
# Sliding Window
**When to use:** Subarray/substring problems with “at most/at least/exactly K …”.

**Core idea:** Expand window with `right`; while invalid, shrink from `left`; track answer on each step.

**Template (pseudo):**
left = 0
for right in range(n):
add arr[right] to window/state
while window invalid:
remove arr[left]; left += 1
update answer from current window


**Pitfalls**
- Forgetting to shrink enough (infinite loop)
- Using length as `right-left` instead of `right-left+1`
- Mixing “at most K” with “exactly K” logic

**Practice set:** LC‑3, LC‑76, LC‑159, LC‑424, LC‑1004
