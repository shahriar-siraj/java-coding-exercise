<div class="brinza-task-description">
<p>There is a queue of N cars waiting at a filling station. There are three fuel dispensers at the station, labeled X, Y and Z, respectively. Each dispenser has some finite amount of fuel in it; at all times the amount of available fuel is clearly displayed on each dispenser.</p>
<p>When a car arrives at the front of the queue, the driver can choose to drive to any dispenser not occupied by another car. Suppose that the fuel demand is D liters for this car. The driver must choose a dispenser which has at least D liters of fuel. If all unoccupied dispensers have less than D liters, the driver must wait for some other car to finish tanking up. If all dispensers are unoccupied, and none has at least D liters, the driver is unable to refuel the car and it blocks the queue indefinitely. If more than one unoccupied dispenser has at least D liters, the driver chooses the one labeled with the smallest letter among them.</p>
<p>Each driver will have to wait some amount of time before he or she starts refueling the car. Calculate the maximum waiting time among all drivers. Assume that tanking one liter of fuel takes exactly one second, and moving cars is instantaneous.</p>
<p>Write a function:</p>
<blockquote><p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>class Solution { public int solution(int[] A, int X, int Y, int Z); }</tt></p></blockquote>
<p>that, given an array A consisting of N integers (which specify the fuel demands in liters for subsequent cars in the queue), and numbers X, Y and Z (which specify the initial amount of fuel in the respective dispensers), returns the maximum waiting time for a car. If any car is unable to refuel, the function should return −1.</p>
<p>For example, given X = 7, Y = 11, Z = 3 and the following array A:</p>
<tt style="white-space:pre-wrap">    A[0] = 2
    A[1] = 8
    A[2] = 4
    A[3] = 3
    A[4] = 2</tt>
<p>the function should return 8. The subsequent cars will have to wait in the queue for 0, 0, 2, 2 and 8 seconds, respectively. The scenario is as follows:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>At time 0, car 0 drives to dispenser X.</li>
<li>At time 0, car 1 drives to dispenser Y.</li>
<li>There is not enough fuel in dispenser Z to satisfy the demands of car 2, so this car must wait. At time 2 car 0 finishes refueling and car 2 drives to dispenser X.</li>
<li>At time 2 car 3 drives to dispenser Z.</li>
<li>At this time all dispensers are occupied, so car 4 waits. There will be not enough fuel in dispensers X and Z after cars 2 and 3 finish tanking up, so car 4 waits until car 1 finishes refuelling at dispenser Y. At time 8, car 4 drives to dispenser Y.</li>
</ul>
</blockquote><p>For X = 4, Y = 0, Z = 3 and array A:</p>
<tt style="white-space:pre-wrap">    A[0] = 5</tt>
<p>the function should return −1.</p>
<p>Write an <b><b>efficient</b></b> algorithm for the following assumptions:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>N is an integer within the range [<span class="number">1</span>..<span class="number">100,000</span>];</li>
<li>each element of array A is an integer within the range [<span class="number">1</span>..<span class="number">1,000,000,000</span>];</li>
<li>X, Y and Z are integers within the range [<span class="number">0</span>..<span class="number">1,000,000,000</span>].</li>
</ul>
</blockquote></div>