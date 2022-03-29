# General Instructions

* *[autoreferencia](./arranjo/)* is the folder where the list (Lista.java), stack (Pilha.java) and queue (Fila.java) are located.
* All the other ".java" files in this directory are solutions for the problems stated. Each solution is specifically indicated by the links provided below.

<section>
<div align="justify">
<br/>

<h2> Problem "New List Operations" </h2>
<ol>
  <li>
  You must implement the method "insereSemRepetir" in the List (Lista.java) so that it inserts an item only if there is no other item in the list with the same key as the item to insert. <a href="./autoreferencia/Lista.java#L72" target="_blank">Check Solution</a> 
  </li>
  <li>
  You must implement the method "uneLista" in the List (Lista.java) so that it concatenates a list, given in the parameter, to its end. <a href="./autoreferencia/Lista.java#L87" target="_blank">Check Solution</a> 
  </li>
  
  <li>
  You must implement a class that tests the methods implemented for the previous itens. <a href="./TestaListaAutoReferenciada.java" target="_blank">Check Solution</a> 
  </li>
</ol>
<br>
<br>
<br>
  
  
<h2> Problem "Stack Test" </h2>
<ol>
<li>
Define a method on the stack (Pilha.java) that prints the elements of the stack on the screen, in stack format. <a href="./autoreferencia/Pilha.java#L35" target="_blank">Check Solution</a> 
</li>
<li>
Test the method  that prints the stack on the screen, in stack format. <a href="./autoreferencia/Exercicio16.java" target="_blank">Check Solution</a> 
</li>
<br>
<br>
<br>
  
  
<h2> Problem "Reminder Stack" </h2>
<ul>
  <li>
  Define a class that represents a Reminder entity. Your reminder must contain at least a text (String) and the time for notification. Assume that the notification time is an integer value informed by the user and formed by the concatenation of hour and minute. Example: 16:03 --> 1603.
  </li>
  <li>Your program should allow the user to create as many reminders as they want.</li>
  <li>Make a program that keeps these reminders in a list as they are generated. Then put them in a stack so that the more recent the notification time, the higher up it is in the stack. At the end, show the reminders to the user, displaying the most recent notification first to the most distant notification.</li>
  <a href="./TestaPilha2.java" target="_blank">Check Solution</a> 
  </li>
</ul>  
<br>
<br>
<br>

<h2> Problem "Queue Test and Interleaving Queue" </h2>
<ol>
  <li>
  Implement a method that prints the queue items in the order they were queued (oldest first and newest last). Test it.  <a href="./arranjo/Fila.java#L36" target="_blank">Check Solution (Part 1)</a> <a href="./Exercicio18.java" target="_blank">Check Solution (Part 2)</a>
  </li>
  <li>
  Implement a method on the queue in which, given another queue, it creates a third queue by interleaving the elements of the second with those of the first. Start merging with the queue that contains the method. Test it. <a href="./arranjo/Fila.java#L46" target="_blank">Check Solution (Part 1)</a> <a href="./Exercicio19.java" target="_blank">Check Solution (Part 2)</a>
  </li>
</ol>
<br>
<br>
<br>

  
<h2> Problem "Ticket emission" </h2>
<ol>
  <li>
Implement a ticket class (Senha.java) which contains a password number, a type of service (priority or normal) and the time it was issued. Your class should override the toString() method in order to return a String with nr. password, time and type of service. 
  <a href="./Lembrete.java" target="_blank">Check Solution</a> 
  </li>

  <li>
Implement a test class that allows the user to generate 10 tickets. These tickets must be entered into a single list as they are generated. At the end of ticket generation, your program should go through the list, queuing priority service tickets in one queue and normal service tickets in another, following the order of the time they were issued. When finished, your program should alternately dequeue a ticket from each queue. For each unqueued ticket, you must print the information for that ticket. <a href="./Exercicio17.java" target="_blank">Check Solution</a>
</li>
</ol>
<br>
<br>
<br>

</div>   
</section>  
