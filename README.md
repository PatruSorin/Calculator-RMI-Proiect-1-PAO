PROIECT RMI

1. Enunt
Realizati o aplicatie distribuita folosind Java si RMI care sa implementeze complet functionalitatea unui calculator aritmetic de buzunar.

2. Detalii
 OPERATII DE BAZA Vor fi implementate urmatoarele operatii aritmetice de baza: - adunare; - scadere; - inmultire; - impartire;
 OPERATII EXTINSE Calculatorul va oferi si urmatoarele operatii extinse: - inversare; - ridicare la putere; - factorial; - radacina patrata.
STARE
OPERANZI Toate operatiile executate de calculator au ca operanzi numere reale in precizie dubla
MEMORIE
Se considera ca modelul implementat ofera memorie, asupra careia se pot face urmatoarele operatii: - adunare (rezultatul curent se adauga la valoarea memoriei); - scadere (rezultatul curent se scade din valoarea memoriei);
Calculatorul mentine starea sa (rezultatul curent) pentru fiecare operatie pe care o
executa. Initial, rezultatul curent este zero si acesta este afectat de fiecare operatie invocata de utilizator (inclusiv de operatiile care lucreaza cu memoria—vezi mai jos). In cazul in care o
operatie genereaza o eroare (cum ar fi ampartirea la zero), rezultatul curent va reprezenta acest
lucru printr-o valoare non-numerica.
- stocare (rezultatul curent devine valoarea memoriei); - citire (valoarea memoriei devine operandul curent); - stergere (valoarea memoriei este (re)initializata cu 0).

3. Informatii suplimentare
Se va realiza atat implementarea aplicatiei server (care expune serviciul de calcul), cat si implementarea unei aplicatii client (care foloseste toate functionalitatile oferite de serviciu). Clientul va permite utilizatorului sa aleaga operatii (si sa introduca operanzii acestora) pe care le va invoca pe server, afisand rezultatele (sau eventualele erori). Proiectul va implementa un meniu simplu (in mod text) care va afisa toate optiunile disponibile iar utilizatorul va selecta o operatie. De ex: Meniu 1. Adunare. 2. Inmultire. Alegeti o operatie: 1
Fiecare client va primi cate un calculator nou, care nu va interactiona cu cele ale altor clienti conectati.

4. Despre erori si tratarea lor
Atat serverul, cat si clientii implementati vor trata gratios toate posibilele erori. Se vor afisa pe ecran mesaje de eroare relevante si codul va trata toate posibilele exceptii.
