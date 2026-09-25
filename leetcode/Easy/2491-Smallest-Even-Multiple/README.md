# Smallest Even Multiple

**Difficulty:** Easy  
**Topics:** Math, Number Theory  
**LeetCode URL:** [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/)

## Problem Description

Given a <strong>positive</strong> integer <code>n</code>, return <em>the smallest positive integer that is a multiple of <strong>both</strong> </em><code>2</code><em> and </em><code>n</code>.
<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 5
<strong>Output:</strong> 10
<strong>Explanation:</strong> The smallest multiple of both 5 and 2 is 10.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 6
<strong>Output:</strong> 6
<strong>Explanation:</strong> The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 150</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Smallest Even Multiple
// Link: https://leetcode.com/problems/smallest-even-multiple/
// Difficulty: Easy
// Language: java

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                return n;
            } else {
                return n * 2;
            }
        }
        return -1;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
