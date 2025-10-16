Chapter 2 Challenge: The Applet Archaeologist
=============================================

Critical Analysis Answers:

1. Security - Two things applets would NOT be allowed to do:
   - Access the local file system: Applets running in the sandbox cannot read, write, 
     or delete files on the user's computer to prevent unauthorized access to sensitive data.
   - Execute system commands: Applets cannot run executable programs or system commands 
     on the host machine, which prevents potential malware behavior.

2. Modern Replacement - Three technologies that replaced Java Applets:
   HTML5, CSS3, and JavaScript.
   
   Example of bouncing text animation using modern technologies:
   
   HTML:
   <div id="bouncingText">Hello Modern Web!</div>
   
   CSS:
   #bouncingText {
     position: absolute;
     font-size: 24px;
     color: green;
     animation: bounce 3s infinite;
   }
   
   @keyframes bounce {
     0% { left: 0px; }
     50% { left: 300px; }
     100% { left: 0px; }
   }
   
   Alternatively, with JavaScript:
   let position = 0;
   function animateText() {
     position += 5;
     if (position > 300) position = 0;
     document.getElementById('bouncingText').style.left = position + 'px';
     requestAnimationFrame(animateText);
   }

3. Legacy - Why developers should still know about applets:
   - Understanding legacy systems: Many enterprise applications still use applets, 
     and developers may need to maintain or migrate them.
   - Historical context: Knowing about applets helps understand the evolution of 
     web technologies and why certain security measures exist today.
   - Learning from past mistakes: Studying deprecated technologies like applets 
     helps developers understand design patterns to avoid and better architectural 
     decisions for future projects.
