Automatizované testování Java + Selenium
========================================

Tato repository obsahuje materiály pro **Digitální akademii: Testování** v **Javě**
s použitím knihovny **Selenium** a **JUnit**.



Osnova
------

1.  Seznámení se Seleniem

    - Lokátory
    - Klikání na WebElementy

2.  Selenium za hranice úplných základů.

    - List<WebElement>
    - Složitější lokátory (XPath a podobně)
    
3.  JUnit a poprvé skutečný automatický test
    
    - Obohacení projektu o JUnit (Maven)
    - Testovací metody místo `main(...)`
    - Assert a koncept ověření (Given-when-then)
    - **Zadání domácího úkolu**
    
4.  Pokročilejší témata z JUnit a Selenia
    
    - Jak se vyznat v chybových hlášeních a výjimkách
    - Koncept čekání na elementy doplněné asynchronně JavaScriptem
    - Cokoliv dalšího, co studenty zajímá
    
5.  Práce na trošku složitější appce

    - Ukázka složitějšího scénáře
    - Rozbor domácího úkolu
    - Bonus: Sémantické metody
    - Bonus: Vzor *Page object*

Po zkušenostech z minula jsme se rozhodli sémantické metody od studentů
nevyžadovat, jen jim je významně doporučit.
Vzor *Page object* je pro úplné začátčníky už docela složitý,
takže ten jsme si jen ukázali a jen malé procento studentek
si jej zapracovalo do domácího úkolu.



Struktura lekce
---------------

Průběh každé lekce je nastaven zhruba takto (obsahuje 5 projektů)

1.  Nejprve demo projekt se vším, co se v lekci bude probírat,
    aby studenti měli představu, kam chceme dojít.
    Jde jen o ukázku s vysvětlením, co je v kódu zapsáno.
    Do tohoto projektu je vhodné nic neprogramovat (nepřidávat),
    ale jen staticky ukazovat.
    Studenti by se měli jen dívat, aby pochopili myšlenku.
    
2.  Výchozí projekt (`***-Zadani`), do kterého lektor může demonstrativně 
    dopsat řešení. Studenti ho mohou následovat
    nebo se mohou pouze dívat.
    Pokud jde o něco složitějšího, je možné to dokonce projít dvakrát.
    Tedy, poprvé nechat studenty jen koukat, pak řešení vzít zpět,
    a podruhé studenty pobídnout, ať si zkoušejí kroky podle lektora.
    
3.  Řešení předchozího projektu (`***-Reseni`). Primárně pro lektora, aby věděl, kam dojít.

4.  Výchozí projekt pro samostatnou práci (v breakout rooms nebo s kouči).

5.  Řešení samostatné práce.



Instalace
---------

Instalační instrukce jsou zde:<br/>
<https://javainstall.czechitas.cz/selenium/>

Poznámka: Předpokládá se úspěšná instalace z Programování (předchozí části Digitální akademie: Testování).
Tedy že studenti mají funkční OpenJDK, IntelliJ IDEA a Maven podle instalačních instrukcí:<br/>
<https://javainstall.czechitas.cz/community/>



Externí webové aplikace
-----------------------

Lekce 1 – 4 používá jednoduchý web *Automation Playground* nasazený na *Repl.it*.
Autorem je Vojtěch Červený z Ostravy a já (Kamil Ševeček) jsem web mírně přizpůsobil.
Jeho zdrojový text je zde:<br/>
<https://github.com/czechitas/da-test-automation-playground/><br/>
Nasazený je zde:<br/>
<https://automation-playground.czechitas.repl.co/>

Lekce 5 a domácí úkol pracují s rozsáhlejší aplikací *Přihlašování na tábory*.
Aplikace je napsána v PHP a autorem je Pavel Kutáč z Ostravy.
Zdroj je k dispozici na:<br/>
<https://github.com/czechitas/da-test-webapp>.




Videozáznamy lekcí
------------------

Pro inspiraci je možné se podívat, jak jsem lekce vedl já (Kamil Ševeček):

1. Lekce (jaro 2021): <https://www.youtube.com/watch?v=-EllizohDCA> 
2. Lekce (jaro 2021): <https://www.youtube.com/watch?v=gVQbSaQ8t4g> 
3. Lekce (jaro 2021): <https://www.youtube.com/watch?v=90P4DatHneo> 
4. Lekce (jaro 2021): <https://www.youtube.com/watch?v=alNjq2rE62E> 
5. Lekce (jaro 2021): <https://www.youtube.com/watch?v=9m8O--gpgIw> 



Jak s materiály pracovat
------------------------

1.  Udělejte si fork materiálů z Githubu a pracujte se svým forkem.
    
2.  Upravte si v projektech cokoliv uznáte za vhodné a nahrávejte studentkám 
    pouze svoje upravené projekty.
    
    Nikdy ne ty z kanonické repository na `github.com/czechitas`,
    protože ty nemůžete operativně měnit.

3.  Podobně si udělejte fork *Automation Playground* na *Repl.itu*
    a do projektů vepište adresu na váš fork místo `https://automation-playground.czechitas.repl.co/`.

4.  Nakonec si udělejte fork webové appky *Přihlašování na tábory* 
    `https://github.com/czechitas/da-test-webapp`,
    kterou je potom třeba nasadit, například zdarma na Heroku.

    Pro první pokusy: Moje nasazení je na <https://cz-test-dva.herokuapp.com/>.
    
    Postup nasazování je na [wiki v Githubu](https://github.com/czechitas/da-test-webapp/wiki) 
    a úvodní info je v [README.md](https://github.com/czechitas/da-test-webapp#user-content-instalace).
    Školení o nasazování appky: <https://www.youtube.com/watch?v=1jtc2uWhCkE>.

    Je to trochu pracné, ale jde to zvládnout.
    Pro nasazení je nutné mít ještě cloudovou databázi MariaDB/MySQL
    (lze také zdarma na Heroku) a souborové úložiště (na Azure).
    Souborové úložiště na Azure je bohužel placená služba,
    která alespoň umožňuje zdarma trial na rok.

5.  Jakékoliv změny v materiálech jsou vítané. Buď po kurzu připravte merge requesty
    nebo se alespoň spojte s aktuálním správcem repository a dodejte mu odkaz na svoje změny.
