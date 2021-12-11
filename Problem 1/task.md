<div class="brinza-task-description">
<p>You are given an implementation of a function:</p>
<blockquote><p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>class Solution { public int solution(int[] A, int X); }</tt></p></blockquote>
<p>This function, when given an array A of N integers, sorted in non-decreasing order, and some integer X, looks for X in A. If X is present in A, then the function returns position of (some) occurrence of X in A. Otherwise, the function returns −1.</p>
<p>For example, given the following array:</p>
<tt style="white-space:pre-wrap">  A[0] = 1    A[1] = 2    A[2] = 5
  A[3] = 9    A[4] = 9</tt>
<p>and X = 5, the function should return 2, as A[2] = 5.</p>
<p>The attached code is still <b><b>incorrect</b></b> for some inputs. Despite the error(s), the code may produce a correct answer for the example test cases. The goal of the exercise is to find and fix the bug(s) in the implementation. You can modify at most <b><b>three</b></b> lines.</p>
<p>Assume that:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>N is an integer within the range [<span class="number">0</span>..<span class="number">100,000</span>];</li>
<li>each element of array A is an integer within the range [<span class="number">−2,000,000,000</span>..<span class="number">2,000,000,000</span>];</li>
<li>array A is sorted in non-decreasing order;</li>
<li>X is an integer within the range [<span class="number">−2,000,000,000</span>..<span class="number">2,000,000,000</span>].</li>
</ul>
</blockquote><p>In your solution, focus on <b><b>correctness</b></b>. The performance of your solution will not be the focus of the assessment.</p>
</div>