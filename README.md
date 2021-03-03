# Burdîniuc Ilie
# Proiect Atelierul Digital Java 2020

## Sistem de evidenta personalului (invatatori, director) si elevi dintr-o scoala.

Din design pattern-uri am folosit singleton, factory si strategy.
Factory si singleton sunt folosite intr-o clasa.
- Factory e folosit pentru crearea instantelor persoanelor (director, elev sau invatator). 
- Singleton e folosit pentru a crea un singur factory. Nu avem nevoie de mai multe factory
intr-un program.
- Strategy este folosit pentru actiuni de mutare a personalului (fie profesor sau elev). 
Pentru fiecare tip de persoana e strategia sa de mutare.