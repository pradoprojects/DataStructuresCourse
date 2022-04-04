# General Instructions

* *[autoreferencia](./autoreferencia/)* is the folder where the list (Lista.java), stack (Pilha.java) and queue (Fila.java) are located.
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
</ol>  
<br>
<br>
<br>
  
<h2> Problem "Stack of Reminders" </h2>
<ul>
  <li>
  Define a class that represents a Reminder entity. Your reminder must contain at least a text (String) and the time for notification. Assume that the notification time is an integer value informed by the user and formed by the concatenation of hour and minute. Example: 16:03 --> 1603. <a href="./Lembrete.java" target="_blank">Check Solution</a> 
  </li>
  <li>Your program should allow the user to create as many reminders as they want.</li>
  <li>Make a program that keeps these reminders in a list as they are generated. Then put them in a stack so that the more recent the notification time, the higher up it is in the stack. At the end, show the reminders to the user, displaying the most recent notification first to the most distant notification.</li>
  <a href="./Exercicio17.java" target="_blank">Check Solution</a> 
  </li>
</ul>  
<br>
<br>
<br>
  
<h2> Problem "Ticket Emission" </h2>
<ul>
  <li>
  Reuse the "Senha" class (Ticket) and implement a test class that allows the user to generate as many tickets as they want. These tickets must be placed in a single queue as they are generated. At the end of ticket generation, your program should dequeue the tickets and requeue them in a queue dedicated to their priority type. When finished, it should print each of the priority queues.<a href="./autoreferencia/Exercicio23.java" target="_blank"> Check Solution</a>
  </li>
</ul>  
<br>
<br>
<br>



</div>   
</section>  
