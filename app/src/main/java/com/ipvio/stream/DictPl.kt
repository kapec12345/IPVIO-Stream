package com.ipvio.stream

/** Polish UI translations. Keep placeholders identical to the German source keys. */
fun loadPolishTexts() {
    I18nCore.loadColumn(I18nCore.CODES.indexOf("pl"), DictPl1, DictPl2, DictPl3, DictPl4, DictPl5, DictPl6, DictPl7)
}

internal val DictPl1 = """
Playlist hinzufügen¦Dodaj playlistę
Dauert nur ein paar Sekunden.¦Zajmuje tylko kilka sekund.
Aus Zwischenablage einfügen¦Wklej ze schowka
Server (z. B. http://server.tld:8080)¦Serwer (np. http://server.tld:8080)
Benutzername¦Nazwa użytkownika
Passwort¦Hasło
Passwort verbergen¦Ukryj hasło
Passwort anzeigen¦Pokaż hasło
Backup-Server {#0} (optional)¦Serwer zapasowy {#0} (opcjonalnie)
+ Backup-Server¦+ Serwer zapasowy
Fällt der Server aus, wechselt die App von selbst zu einem Backup-Server. Anbieter nennen sie oft als weitere Server- oder DNS-Adressen; Benutzername und Passwort bleiben gleich.¦Jeśli serwer ulegnie awarii, aplikacja sama przełączy się na serwer zapasowy. Dostawcy często wymieniają je jako adresy dodatkowego serwera lub DNS; nazwa użytkownika i hasło pozostają takie same.
Backup-Server ungültig: Adresse wie http://server.tld:8080 eingeben.¦Nieprawidłowy serwer zapasowy: wpisz adres, np. http://server.tld:8080.
Backup-Server¦Serwery zapasowe
Backup-Server: {#0}¦Serwery zapasowe: {#0}
Backup-Server speichern¦Zapisz serwery zapasowe
Erreichbar¦Dostępny
Nicht erreichbar seit {0}¦Niedostępny od {0}
Nicht erreichbar: {0}¦Niedostępny: {0}
Hauptserver: {0}¦Serwer główny: {0}
Hinzufügen¦Dodaj
Abbrechen¦Anuluj
Alle¦Wszystkie
Alle anzeigen¦Pokaż wszystko
Neu hinzugefügt¦Ostatnio dodane
Beliebtheit¦Popularność
Playlist¦Playlista
vor 1990¦przed 1990 rokiem
{#0} Titel¦{#0} tytułów
{0} werden geladen … {#1} / {#2}¦Ładowanie {0} … {#1} / {#2}
{0} laden … {#1}/{#2}¦Ładowanie {0} … {#1}/{#2}
Metadaten¦Metadane
Länder¦Kraje
Zurück = Filter¦Wstecz = Filtry
Sortierung¦Sortowanie
Rating¦Ocena
Jahr¦Rok
Genre¦Gatunek
Land¦Kraj
Zurücksetzen¦Przywróć domyślne
Raster¦Siatka
Kino¦Widok kinowy
Ansicht¦Widok
Keine Treffer – Filter zurücksetzen.¦Brak wyników – zresetuj filtry.
Liste¦Lista
Besetzung¦Obsada
Regie¦Reżyser
Erstellt von¦Twórcy
Schauspiel¦Obsada
Drehbuch¦Scenariusz
geboren {0}¦urodzony {0}
Weniger¦Mniej
Mehr lesen¦Czytaj więcej
Infos konnten nicht geladen werden.¦Nie można załadować informacji.
Keine Titel in deiner Playlist¦Brak tytułów na Twojej liście odtwarzania
In deiner Playlist¦Na Twojej liście odtwarzania
{#0} weitere Titel dieser Person sind nicht in deiner Playlist.¦{#0} więcej tytułów tej osoby nie znajduje się na Twojej liście odtwarzania.
Lade …¦Ładowanie…
Zuletzt geschaut¦Ostatnio oglądane
Meine Liste¦Moja lista
In Meiner Liste¦Na mojej liście
Filter¦Filtry
Standard¦Domyślne
Kacheln¦Kafelki
{#0} Kategorien¦{#0} kategorii
Kategorien¦Kategorie
Sonstige¦Inne
Anime¦Anime
Animation¦Animacja
Film¦Film
{#0} Staffel(n)¦Liczba sezonów: {#0}
{#0} Min¦{#0} min
bei {#0} Min¦w {#0} min
TMDB antwortet mit Fehler {#0}¦TMDB zwróciło błąd {#0}
Keine Verbindung zu TMDB ({0})¦Brak połączenia z TMDB ({0})
Besetzung nicht lesbar ({0})¦Nie można odczytać obsady ({0})
Besetzung nicht verfügbar: {0}¦Obsada niedostępna: {0}
Keine App zum Öffnen des Trailers gefunden¦Nie znaleziono aplikacji umożliwiającej otwarcie zwiastuna
Externer Player¦Odtwarzacz zewnętrzny
Kein externer Player installiert (z. B. VLC)¦Nie zainstalowano zewnętrznego odtwarzacza (np. VLC)
Keine Beschreibung gefunden.¦Nie znaleziono opisu.
Tipp: TMDB-Schlüssel in secrets.properties eintragen, dann erscheinen hier Beschreibung, Cover und Bewertungen.¦Wskazówka: dodaj swój klucz TMDB w secrets.properties, aby zobaczyć tutaj opisy, okładki i oceny.
Fortsetzen {0}¦Wznów {0}
Von vorn¦Od początku
Abspielen¦Odtwórz
Trailer¦Zwiastun
Extern¦Zewnętrzne
Automatisch (beste)¦Automatyczny (najlepszy)
Qualität¦Jakość
Automatisch¦Automatycznie
Sprache¦Język
Quelle¦Źródło
gilt für alle Folgen¦dotyczy wszystkich odcinków
Staffeln¦Sezony
Staffel {#0}¦Sezon {#0}
Episoden¦Odcinki
lade Infos …¦ładowanie informacji…
Links/Rechts = Staffel wechseln¦Lewo/prawo = zmiana sezonu
Ähnliche Titel in deiner Playlist¦Podobne tytuły na Twojej liście odtwarzania
Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert.¦Ten produkt wykorzystuje interfejs API TMDB, ale nie jest zatwierdzony ani certyfikowany przez TMDB.
Raster anpassen¦Dostosuj siatkę
Spalten¦Kolumny
Zeilen¦Wiersze
Die Ansicht dahinter ändert sich sofort. Zurück schließt.¦Podgląd w tle zmienia się od razu. Wstecz zamyka okno.
Keine EPG-Adresse gefunden¦Nie znaleziono adresu EPG
Playlist enthält keine Sender-IDs (tvg-id)¦Lista odtwarzania nie zawiera identyfikatorów kanałów (tvg-id)
Keine Programmdaten erhalten ({0})¦Nie wczytano danych EPG ({0})
Geladen: {#0} Sender mit Programm¦Wczytano EPG dla {#0} kanałów
Noch nicht geladen¦Jeszcze nie załadowano
Wird geladen …¦Ładowanie…
Intro überspringen¦Pomiń czołówkę
Rückblick überspringen¦Pomiń przypomnienie
Abspann überspringen¦Pomiń napisy końcowe
Titel-Infos¦Informacje o tytule
Cover, Beschreibungen, Bewertungen¦Okładki, opisy, oceny
Schauspieler, Regie, ähnliche Titel¦Aktorzy, reżyserzy, podobne tytuły
Playlist-Zwischenspeicher¦Pamięć podręczna list odtwarzania
Schneller Start ohne Wartezeit¦Szybki start bez czekania
Bilder¦Obrazy
Zwischengespeicherte Cover und Hintergründe¦Okładki i tła zapisane w pamięci podręcznej
Noch einmal Zurück drücken zum Beenden¦Naciśnij ponownie przycisk Wstecz, aby wyjść
Die Playlist konnte nicht geladen werden¦Nie można załadować listy odtwarzania
Noch keine Sender¦Nie ma jeszcze kanałów
Prüfe die Internetverbindung, die Adresse und die Zugangsdaten.¦Sprawdź swoje połączenie internetowe, adres i dane do logowania.
Erneut versuchen¦Spróbuj ponownie
Im Trend¦Trendy
Top 10¦Top 10
Top bewertet¦Najwyżej oceniane
Diese Playlist enthält keine Filme oder Serien. Live TV findest du links.¦Ta playlista nie zawiera filmów ani seriali. Po lewej stronie znajdziesz telewizję na żywo.
Filme¦Filmy
Serien¦Seriale
Alle {#0}¦Wszystkie {#0}
Alle {0}¦Wszystkie {0}
Keine {0} in dieser Playlist¦Brak {0} na tej liście odtwarzania
Weitere Kategorien findest du unter „Kategorien“ oben.¦Więcej kategorii znajdziesz w sekcji „Kategorie” powyżej.
Filme, Serien oder Sender suchen…¦Wyszukaj filmy, seriale lub kanały…
Letzte Suchanfragen¦Ostatnie wyszukiwania
Verlauf löschen¦Wyczyść historię
Keine Treffer für „{0}“¦Brak wyników dla „{0}”
Suche „{0}“¦Wyszukaj „{0}”
Live TV¦Telewizja na żywo
Weiterschauen¦Kontynuuj oglądanie
Mehr Infos¦Więcej informacji
Favoriten¦Ulubione
Alle Sender¦Wszystkie kanały
Noch keine Favoriten. Sender mit OK (gedrückt halten) oder der Menü-Taste als Favorit markieren.¦Nie ma jeszcze ulubionych. Oznacz kanały jako ulubione, przytrzymując OK lub naciskając klawisz Menu.
Keine Sender¦Brak kanałów
Violett & Türkis¦Fioletowy i turkusowy
Ozean¦Ocean
Smaragd¦Szmaragd
Sonnenuntergang¦Zachód słońca
Rosé¦Różowe
Gold¦Złoto
Orange¦Pomarańczowy
Eisblau¦Lodowoniebieski
Limette¦Limonka
Purpur¦Fioletowy
Schiefer¦Łupek
Mitternacht¦Północ
OLED-Schwarz¦OLED czarny
Graphit¦Grafit
Tiefblau¦Głęboki błękit
Aus¦Wyłączone
An¦Włączone
Dezent¦Subtelny
Normal¦Normalny
Endet um {0}¦Kończy się o {0}
Klein¦Mały
Mittel¦Średni
Groß¦Duży
Kompakt¦Kompaktowy
Jetzt¦Teraz
Jetzt {0}¦Teraz {0}
TV-Guide – Ansicht¦Przewodnik telewizyjny – zobacz
Zoom¦Powiększ
Zeilenhöhe¦Wysokość rzędu
Vergangene Sendungen¦Wcześniejsze programy
Zurück = schließen¦Wstecz = zamknij
Menü-Taste im TV-Guide = Zoom¦Klawisz menu w przewodniku telewizyjnym = powiększenie
Zeitzone {0} (änderbar unter Einstellungen > Sprache & Region)¦Strefa czasowa {0} (zmień w Ustawieniach > Język i region)
Sendungen¦Programy
Sender¦Kanały
Menü¦Menu
Zurück¦Wstecz
in {#0} Min¦za {#0} min
noch {#0} Min¦Pozostało {#0} min
Keine Beschreibung vorhanden.¦Brak dostępnego opisu.
TV-Guide¦Przewodnik telewizyjny
Wähle eine Sendung mit den Pfeiltasten, OK schaltet auf den Sender.¦Klawiszami strzałek wybierz program, OK przełącza na kanał.
Zurück bringt dich zur Senderspalte, nochmal Zurück schließt.¦Wstecz przenosi Cię do kolumny kanału. Naciśnij ponownie Wstecz, aby zamknąć.
lädt …¦ładowanie…
Kein Programm verfügbar¦Brak danych EPG
Kein Programm für diesen Sender¦Brak danych EPG dla tego kanału
Danach {0}¦Następnie: {0}
OK halten = Kategorie als Favorit¦Przytrzymaj OK = ulubiona kategoria
OK = ansehen¦OK = oglądaj
halten = Favorit¦przytrzymaj = ulubione
Mono¦Mono
Stereo¦Stereo
{#0} Kanäle¦{#0} kanałów
Spur {#0}¦Ścieżka {#0}
1× (Normal)¦1× (normalna)
Zugang abgelehnt ({#0}). Benutzername, Passwort oder Abo beim Anbieter prüfen.¦Odmowa dostępu ({#0}). Sprawdź nazwę użytkownika, hasło lub subskrypcję u swojego dostawcy.
Dieser Sender ist beim Anbieter nicht mehr vorhanden.¦Ten kanał już nie istnieje u operatora.
Dieser Titel ist beim Anbieter nicht mehr vorhanden.¦Ten tytuł nie jest już dostępny u dostawcy.
Maximale Verbindungen des Anbieters erreicht. Anderes Gerät oder Profil beenden und erneut versuchen.¦Osiągnięto maksymalną liczbę połączeń Twojego dostawcy. Zatrzymaj inne urządzenie lub profil i spróbuj ponownie.
Zu viele gleichzeitige Verbindungen. Anderes Gerät beenden und erneut versuchen.¦Zbyt wiele jednoczesnych połączeń. Zatrzymaj inne urządzenie i spróbuj ponownie.
Der Anbieter hat gerade ein Problem ({#0}). Später erneut versuchen.¦Dostawca ma teraz problem ({#0}). Spróbuj ponownie później.
Der Anbieter lehnt die Wiedergabe ab ({#0}).¦Dostawca odmawia odtwarzania ({#0}).
Keine Verbindung zum Anbieter. Internet und Netzwerk prüfen.¦Brak połączenia z dostawcą. Sprawdź internet i sieć.
Dieses Videoformat kann das Gerät nicht abspielen.¦To urządzenie nie może odtwarzać tego formatu wideo.
Der Stream ist fehlerhaft oder wird nicht unterstützt.¦Strumień jest uszkodzony lub nieobsługiwany.
Wiedergabe nicht möglich.¦Odtwarzanie nie jest możliwe.
Audio & Untertitel¦Dźwięk i napisy
Links schließt das Menü¦Strzałka w lewo zamyka menu
Rechts wechselt zu den Untertiteln¦Strzałka w prawo otwiera napisy
Audio¦Dźwięk
Keine Auswahl verfügbar¦Brak dostępnego wyboru
Untertitel¦Napisy
Dieser Stream enthält keine Untertitel.¦Ten strumień nie ma napisów.
Aussehen der Untertitel¦Wygląd napisów
Folgen¦Odcinki
Folge {#0}¦Odcinek {#0}
Einpassen¦Dopasuj
Zoom (Rand abschneiden)¦Zoom (przytnij krawędzie)
Strecken¦Rozciągnij
Verbindung unterbrochen – neuer Versuch ({#0}/3)¦Połączenie utracone – ponowna próba ({#0}/3)
Intro¦Wprowadzenie
So sehen deine Untertitel aus¦Tak wyglądają Twoje napisy
Senderliste¦Lista kanałów
Aus Favoriten entfernen¦Usuń z ulubionych
Zu Favoriten hinzufügen¦Dodaj do ulubionych
Bildformat¦Proporcje
Extern öffnen¦Otwórz w innym odtwarzaczu
Hoch und Runter wechseln den Sender¦Strzałki w górę i w dół zmieniają kanał
Zeitleiste¦Oś czasu
= {#0} s springen¦= przewiń o {#0} s
Halten = weiter springen¦Przytrzymaj, aby przewijać dalej
Vorherige Folge: Staffel {#0}, Folge {#1}¦Poprzedni odcinek: sezon {#0}, odcinek {#1}
Vorherige Folge¦Poprzedni odcinek
Nächste Folge: Staffel {#0}, Folge {#1}¦Następny odcinek: sezon {#0}, odcinek {#1}
Nächste Folge¦Następny odcinek
{#0} Sekunden zurück¦{#0} sekund wstecz
Pause¦Pauza
{#0} Sekunden vor¦{#0} sekund do przodu
Einstellungen¦Ustawienia
Links = zurück¦Lewo = wstecz
Größe¦Rozmiar
Farbe¦Kolor
Hintergrund¦Tło
Rand¦Krawędź
OK = nächster Wert. Die Vorschau zeigt das Ergebnis.¦OK = następna wartość. Podgląd pokazuje wynik.
Videoqualität¦Jakość wideo
Keine Auswahl verfügbar (feste Qualität).¦Brak dostępnego wyboru (stała jakość).
Sprungweite¦Długość przeskoku
Gilt für Links/Rechts, Halten und die Zeitleiste.¦Dotyczy lewej/prawej strony, przytrzymania i osi czasu.
Nächste Folge automatisch¦Następny odcinek automatycznie
Endzeit anzeigen¦Pokaż czas zakończenia
Startet in {0}¦Zaczyna się za {0}
Server antwortet mit Fehler {#0}¦Serwer zwrócił błąd {#0}
Der Server hat keine Daten geliefert¦Serwer nie zwrócił żadnych danych
Keine Sender in der Playlist gefunden¦Na liście odtwarzania nie znaleziono kanałów
Unbekannter Fehler¦Nieznany błąd
Allgemein¦Ogólne
Start, Beenden, Autostart¦Start, wyjście, autostart
Sprache & Region¦Język i region
Sprache, Uhrzeit, Zeitzone¦Język, czas, strefa czasowa
Kartengröße, Raster¦Rozmiar karty, siatka
Design¦Wygląd
Farben, Schrift, Animationen¦Kolory, czcionka, animacje
Reihenfolge und Einträge¦Kolejność i pozycje
Player¦Odtwarzacz
Spulen, Intro, Bildformat¦Przewijanie, czołówka, proporcje obrazu
Ton & Untertitel¦Dźwięk i napisy
Sprachen, Untertitel-Stil¦Języki, styl napisów
Genres & Kategorien¦Gatunki i kategorie
Automatisch oder vom Anbieter¦Automatycznie lub od dostawcy
Live-TV & Guide¦Telewizja na żywo i przewodnik
TV-Programm, Favoriten¦Program telewizyjny, ulubione
Playlists¦Playlisty
Verwalten, Aktualisieren¦Zarządzaj, aktualizuj
Jugendschutz¦Kontrola rodzicielska
PIN, Inhalte ab 18¦PIN, treści dla dorosłych
Speicher¦Pamięć
Cache, Verlauf, Fortsetzen¦Pamięć podręczna, historia, wznawianie
Diagnose¦Diagnostyka
Status und Fehlersuche¦Stan i rozwiązywanie problemów
Über IPVIO Stream¦O aplikacji IPVIO Stream
Version, Quellen, Zurücksetzen¦Wersja, źródła, reset
Wirklich? OK zum Bestätigen¦Naprawdę? OK, aby potwierdzić
‹ Zurück¦‹ Wróć
Automatisch (Gerät)¦Automatycznie (język urządzenia)
Sprache der App¦Język aplikacji
Alle Menüs und Hinweise erscheinen in dieser Sprache. Beschreibungen, Besetzung und Titel-Infos kommen von TMDB und werden in derselben Sprache geladen, sobald du einen Titel öffnest. Namen von Sendern, Filmen und Kategorien stammen von deinem Anbieter und bleiben unverändert.¦Wszystkie menu i wskazówki pojawiają się w tym języku. Opisy, informacje o obsadzie i tytule pochodzą z TMDB i są ładowane w tym samym języku po otwarciu tytułu. Nazwy kanałów, filmów i kategorii pochodzą od Twojego dostawcy i pozostają niezmienione.
Uhrzeit¦Czas
Zeitformat¦Format czasu
24 Stunden (14:30)¦24 godziny (14:30)
12 Stunden (2:30 PM)¦12-godzinny (2:30 PM)
Zeitzone¦Strefa czasowa
Systemzeit (Gerät: {0})¦Czas systemowy (urządzenie: {0})
Uhrzeit jetzt¦Aktualna godzina
Gilt für alle Uhrzeiten, zum Beispiel im TV-Guide und in der Live-TV-Infoleiste. „Systemzeit“ nutzt die Einstellung deines Geräts. Zeigt die App Uhrzeiten falsch an, steht dein Fernseher vermutlich auf UTC; wähle dann hier deine Zeitzone.¦Dotyczy wszystkich czasów, na przykład w przewodniku telewizyjnym i pasku informacyjnym telewizji na żywo. „Czas systemowy” korzysta z ustawień Twojego urządzenia. Jeśli aplikacja pokazuje błędne godziny, prawdopodobnie Twój telewizor jest ustawiony na UTC; następnie wybierz tutaj swoją strefę czasową.
PIN eingeben¦Wprowadź PIN
Die Jugendschutz-Einstellungen sind mit einer PIN geschützt.¦Ustawienia kontroli rodzicielskiej są chronione kodem PIN.
Falsche PIN¦Nieprawidłowy PIN
Neue PIN festlegen¦Ustaw nowy PIN
Wähle eine 4-stellige PIN.¦Wybierz 4-cyfrowy PIN.
PIN bestätigen¦Potwierdź PIN
Gib die PIN noch einmal ein.¦Wprowadź ponownie PIN.
Die PINs stimmen nicht überein¦Kody PIN nie są zgodne
Inhalte für Erwachsene ausblenden¦Ukryj treści dla dorosłych
Blendet Kategorien und Titel mit Begriffen wie XXX, Adult oder 18+ in der ganzen App aus: Startseite, Suche, Listen und Live-TV.¦Ukrywa kategorie i tytuły zawierające terminy takie jak XXX, Dorosły lub 18+ w całej aplikacji: strona główna, wyszukiwanie, listy i telewizja na żywo.
Der Schutz ist aktiv.¦Ochrona jest aktywna.
{#0} Einträge in deiner Playlist würden ausgeblendet.¦{#0} wpisy na Twojej liście odtwarzania zostaną ukryte.
Kein Erwachsenen-Inhalt erkannt.¦Nie wykryto treści dla dorosłych.
PIN¦PIN
PIN ist gesetzt¦PIN jest ustawiony
Keine PIN gesetzt¦Brak ustawionego kodu PIN
PIN ändern¦Zmień PIN
PIN festlegen¦Ustaw PIN
PIN entfernen¦Usuń PIN
Mit einer PIN lässt sich der Schutz nur nach Eingabe der PIN ändern. Die Erkennung arbeitet mit Stichwörtern in Kategorie- und Titelnamen und ist kein vollständiger Filter. Beim Zurücksetzen aller Einstellungen bleibt die PIN erhalten.¦W przypadku PIN-u ochronę można zmienić dopiero po wprowadzeniu PIN-u. Wykrywanie wykorzystuje słowa kluczowe w nazwach kategorii i tytułów i nie jest filtrem kompletnym. Kod PIN zostanie zachowany po zresetowaniu wszystkich ustawień.
Start¦Strona główna
Beim Einschalten des Geräts öffnen¦Otwórz po uruchomieniu urządzenia
IPVIO Stream startet automatisch, sobald der Fernseher oder die Box hochgefahren ist.¦IPVIO Stream uruchamia się automatycznie zaraz po uruchomieniu telewizora lub urządzenia.
Berechtigung erteilt¦Pozwolenie udzielone
Berechtigung „Über anderen Apps einblenden“ fehlt¦Brak pozwolenia „Wyświetlanie nad innymi aplikacjami”.
Einstellung öffnen¦Otwórz ustawienie
Prüfen¦Sprawdź
Ab Android 10 erlaubt das System den Autostart nur mit dieser Berechtigung. Manche Geräte (z. B. einzelne Fire-TV-Modelle) blockieren den Autostart trotzdem; das kann die App nicht ändern.¦Od Androida 10 system pozwala na autostart tylko z tym uprawnieniem. Niektóre urządzenia (np. niektóre modele Fire TV) i tak blokują autostart; aplikacja nie może tego zmienić.
Suche¦Szukaj
Startseite¦Strona startowa
Diese Seite öffnet sich beim Start der App. Versteckte Menüpunkte sind nicht wählbar.¦Ta strona otwiera się po uruchomieniu aplikacji. Nie można wybrać ukrytych pozycji menu.
Letzten Sender beim Start abspielen¦Odtwarzaj ostatni kanał po uruchomieniu
Wenn du zuletzt Live TV gesehen hast, läuft dieser Sender direkt nach dem Start.¦Jeśli ostatnio oglądałeś telewizję na żywo, kanał ten będzie odtwarzany zaraz po rozpoczęciu.
Bedienung¦Sterowanie
Beenden bestätigen¦Potwierdź wyjście
Auf der Startseite muss „Zurück“ zweimal gedrückt werden, damit die App nicht aus Versehen schließt.¦Na stronie głównej należy dwukrotnie nacisnąć „Wstecz”, aby aplikacja nie została przypadkowo zamknięta.
Dieses Gerät bietet die Einstellung nicht an. Autostart funktioniert evtl. trotzdem.¦To urządzenie nie oferuje tego ustawienia. Funkcja automatycznego uruchamiania może nadal działać.
Zwischenspeicher¦Pamięć podręczna
Leeren¦Wyczyść
Gesamt¦Łącznie
Geleerte Daten lädt die App bei Bedarf neu. Titel-Infos und Bilder erscheinen danach kurz später. Der Playlist-Zwischenspeicher macht den Start schnell; ohne ihn wartet die App auf den Download.¦Aplikacja w razie potrzeby ponownie ładuje usunięte dane. Informacje o tytule i obrazy pojawiają się nieco później. Pamięć podręczna list odtwarzania ułatwia szybkie rozpoczęcie; bez niego aplikacja czeka na pobranie.
Verlauf¦Historia
Suchverlauf löschen¦Wyczyść historię wyszukiwania
Zuletzt geschaut löschen¦Wyczyść ostatnio oglądane
Weiterschauen löschen¦Wyczyść sekcję „Kontynuuj oglądanie”
Meine Liste und Favoriten bleiben immer erhalten.¦Moja lista i ulubione są zawsze przechowywane.
Filme, Serien und Sender¦Filmy, seriale i kanały
Raster zeigt viele Titel auf einmal. Kino zeigt oben die Details zum markierten Titel und unten eine Reihe zum Durchblättern.¦Siatka pokazuje wiele tytułów jednocześnie. Kino pokazuje szczegóły wybranego tytułu na górze i wiersz do przeglądania poniżej.
Spalten (Raster)¦Kolumny (siatka)
Zeilen (Raster)¦Wiersze (siatka)
Banner wechselt¦Zmiany w banerach
nie¦nigdy
alle {#0} s¦co {#0} s
Kartengröße (Reihen)¦Rozmiar karty (wiersze)
Kategorien-Ansicht¦Widok kategorii
Liste mit Vorschau¦Lista z podglądem
Das Raster kannst du zusätzlich direkt in der Rasteransicht mit dem Raster-Knopf ändern.¦Możesz także zmienić siatkę bezpośrednio w widoku siatki za pomocą przycisku siatki.
Verschiebe Einträge mit den Pfeil-Knöpfen oder blende sie aus. Start und Einstellungen bleiben immer sichtbar.¦Przesuń wpisy za pomocą przycisków strzałek lub ukryj je. Strona główna i Ustawienia zawsze pozostają widoczne.
versteckt¦ukryte
sichtbar¦widoczne
Standard-Reihenfolge wiederherstellen¦Przywróć domyślną kolejność
Sprung links/rechts¦Przewijanie w lewo/prawo
Standard-Bildformat¦Domyślne proporcje obrazu
Intro überspringen anbieten¦Pokazuj przycisk pomijania czołówki
Zeigt bei Serien einen Knopf „Intro überspringen“, wenn Intro-Zeiten bekannt sind.¦Wyświetla przycisk „Pomiń czołówkę” dla seriali, gdy znane są godziny wprowadzenia.
Stream-Info am Start¦Informacje o strumieniu na początku
Zeigt kurz Auflösung, Ton und Format beim Abspielen von Filmen und Serien.¦Krótko pokazuje rozdzielczość, dźwięk i format podczas odtwarzania filmów i seriali.
Steuerleiste ausblenden nach¦Ukryj pasek sterowania po
Startet die nächste Folge nach dem Abspann von selbst.¦Rozpoczyna kolejny odcinek po napisach końcowych.
Zeigt, um wie viel Uhr der Film voraussichtlich endet.¦Pokazuje, o której godzinie spodziewany jest koniec filmu.
Intro automatisch überspringen¦Automatycznie pomijaj czołówkę
Überspringt bekannte Intros ohne Rückfrage.¦Pomija znane wstępy bez pytania.
Bedienung: OK = Pause, Links/Rechts = Sprung (Halten = weiter springen), mehrere Sprünge werden gesammelt, Zurück beim Spulen = abbrechen, Hoch = Zeitleiste, Runter = Steuerleiste. Intro-Zeiten stammen aus der Community-Datenbank TheIntroDB und gibt es nicht für jede Serie. Die Stream-Info erscheint nur bei Filmen und Serien.¦Sterowanie: OK = pauza, Lewo/Prawo = pomiń (przytrzymaj = kontynuuj pomijanie), zbieranych jest wiele pominięć, Wstecz podczas wyszukiwania = anuluj, W górę = oś czasu, W dół = pasek sterowania. Czasy wprowadzenia pochodzą z bazy danych społeczności TheIntroDB i nie są dostępne dla każdej serii. Informacje o strumieniu pojawiają się tylko w przypadku filmów i seriali.
Farbthema¦Motyw kolorów
Eigene Farbe¦Kolor niestandardowy
Übernehmen¦Zastosuj
Ungültig¦Nieprawidłowy
Wähle ein Farbfeld oder gib einen Hex-Code ein, z. B. #FF6A00. Die App passt die Farbe automatisch so an, dass Schrift immer gut lesbar bleibt.¦Wybierz próbkę lub wprowadź kod szesnastkowy, np. #FF6A00. Aplikacja automatycznie dostosowuje kolor, dzięki czemu tekst jest zawsze czytelny.
Darstellung¦Wygląd
Animationen¦Animacje
Anzeigegröße¦Rozmiar wyświetlacza
Oberfläche aktuell ×¦Interfejs obecnie ×
(Bildschirm¦(ekran
dp breit). Standard ist 85 %: mehr Inhalt, Elemente bleiben gut lesbar. „Automatisch“ vergrößert die App auf sehr breiten Bildschirmen.¦dp szerokości). Wartość domyślna to 85%: więcej treści, elementy pozostają łatwe do odczytania. „Automatycznie” powiększa aplikację na bardzo szerokich ekranach.
Schrift¦Czcionka
Schriftart¦Rodzina czcionek
Schriftgröße¦Rozmiar czcionki
Aa – So sieht deine Schrift aus¦Aa – Tak wygląda Twoja czcionka
Fünf klare Systemschriften, die auf jedem Gerät vorhanden sind. Die Schriftgröße wirkt zusätzlich zur Anzeigegröße.¦Pięć czystych czcionek systemowych dostępnych na każdym urządzeniu. Rozmiar czcionki ma zastosowanie do rozmiaru wyświetlacza.
Vorschau¦Podgląd
Aktiv¦Aktywny
Hervorhebung¦Podświetlenie
Animationen „Aus“ schaltet die Vergrößerung beim Fokus ab, „Dezent“ macht sie schwächer. Das schont schwache Geräte.¦Animacje „Wyłączone” wyłącza powiększenie przy ustawianiu ostrości, „Subtelne” osłabia je. Oszczędza to słabe urządzenia.
Design zurücksetzen¦Przywróć domyślny wygląd
keiner seit dem Start¦brak od uruchomienia
Version¦Wersja
Bildschirm¦Ekran
{0} × {1} dp · Dichte¦{0} × {1} dp · gęstość
Inhalte¦Treść
{0} Sender · {1} Filme · {2} Serien¦{0} kanałów · {1} filmów · {2} seriali
Ladezustand¦Stan ładowania
Programm (EPG)¦Program TV (EPG)
{0} · {1} Sender¦{0} · {1} kanałów
lädt {0}/{1}¦ładowanie {0}/{1}
kein TMDB-Schlüssel¦brak klucza TMDB
Letzter Fehler¦Ostatni błąd
Fehler seit Start¦Błędy od uruchomienia
Playlist neu laden¦Odśwież playlistę
Bericht kopieren¦Skopiuj raport
IPVIO Diagnose¦Diagnostyka IPVIO
Der Bericht enthält keine Adressen, Benutzernamen oder Passwörter. Er wird nur in die Zwischenablage kopiert und nirgendwohin gesendet.¦Raport nie zawiera adresów, nazw użytkowników ani haseł. Jest on jedynie kopiowany do schowka i nie jest nigdzie wysyłany.
Tonspur¦Ścieżka audio
Automatische Genres¦Gatunki automatyczne
Aus = Kategorien deines Anbieters¦Wył. = kategorie Twojego dostawcy
"""

internal val DictPl2 = """
Automatische Genres sortieren Titel nach Genre (Anime = Animation aus Japan). Beim ersten Mal dauert das einige Minuten, danach ist alles gespeichert. Aus = die Kategorien deines Anbieters in der Reihenfolge deines Anbieters. In der Ansicht „Kategorien“ kannst du jederzeit zwischen beiden wechseln.¦Gatunki automatyczne sortują tytuły według gatunku (Anime = animacja z Japonii). Za pierwszym razem zajmuje to kilka minut, później wszystko zostaje zapisane. Wyłączone = kategorie Twojego dostawcy w kolejności Twojego dostawcy. W widoku „Kategorie” możesz w dowolnym momencie przełączać się między nimi.
Automatische Genres brauchen den TMDB-Schlüssel in Config.kt.¦Gatunki automatyczne wymagają klucza TMDB w Config.kt.
TV-Programm (EPG)¦Program telewizyjny (EPG)
Programm bei {0} von {1} Sendern möglich¦Możliwe pobieranie EPG dla {0} z {1} kanałów
XMLTV: {0}¦XMLTV: {0}
Die App sucht die Programmdaten automatisch (Xtream-Schnittstelle oder XMLTV-Adresse aus der Playlist). Wenn dein Anbieter eine eigene XMLTV-Adresse nennt, trage sie hier ein.¦Aplikacja automatycznie wyszukuje dane harmonogramu (interfejs Xtream lub adres XMLTV z listy odtwarzania). Jeśli Twój dostawca podaje własny adres XMLTV, wpisz go tutaj.
Speichern & laden¦Zapisz i wczytaj
Neu laden¦Wczytaj ponownie
Sender oder Kategorien als Favorit markieren: OK gedrückt halten oder Menü-Taste.¦Oznacz kanały lub kategorie jako ulubione: przytrzymaj OK lub naciśnij klawisz Menu.
Meine Playlists ({0})¦Moje playlisty ({0})
Aktivieren¦Aktywuj
Umbenennen¦Zmień nazwę
Löschen¦Usuń
Name der Playlist¦Nazwa playlisty
Name speichern¦Zapisz nazwę
+ Weitere Playlist hinzufügen¦+ Dodaj kolejną playlistę
Aktive Playlist neu laden¦Wczytaj ponownie aktywną playlistę
Automatisch aktualisieren¦Aktualizuj automatycznie
Bei jedem Start¦Przy każdym uruchomieniu
Täglich¦Codziennie
Wöchentlich¦Co tydzień
Nur von Hand¦Tylko ręcznie
Playlist aktualisieren¦Odśwież playlistę
Abstand¦Interwał
alle {0} Stunden¦co {0} godzin
Wochentag¦Dzień tygodnia
Stunde¦Godzina
Minute¦Minuta
Zuletzt aktualisiert:¦Ostatnia aktualizacja:
noch nie¦nigdy
Nächste Aktualisierung:¦Następna aktualizacja:
„Bei jedem Start“ lädt die Playlist bei jedem Öffnen der App. Die geplanten Varianten laufen auch im Hintergrund, solange das Gerät eingeschaltet und online ist, und holen verpasste Termine beim nächsten Start nach. „Nur von Hand“ nutzt immer den gespeicherten Stand; Neu laden geht jederzeit mit dem Knopf oben. Die Uhrzeit richtet sich nach deiner Zeitzone unter „Sprache & Region“.¦„Przy każdym uruchomieniu” ładuje listę odtwarzania przy każdym otwarciu aplikacji. Zaplanowane opcje działają również w tle, gdy urządzenie jest włączone i online, i pozwalają nadrobić zaległości przy następnym uruchomieniu. Opcja „Tylko ręcznie” zawsze wykorzystuje zapisaną kopię; możesz w dowolnym momencie załadować ponownie za pomocą przycisku powyżej. Czas jest zgodny ze strefą czasową w sekcji „Język i region”.
Zugangsdaten werden nur auf diesem Gerät gespeichert und hier nicht angezeigt. Es ist immer eine Playlist aktiv. Mit „Aktivieren“ wechselst du die Liste.¦Dane logowania są przechowywane tylko na tym urządzeniu i nie są tutaj wyświetlane. Zawsze aktywna jest jedna playlista. Użyj „Aktywuj”, aby przełączyć listy.
IPVIO Stream · Version¦IPVIO Stream · Wersja
IPVIO Stream ist ein Player und liefert selbst keine Inhalte. Nutze nur Quellen, für die du eine Berechtigung hast.¦IPVIO Stream jest odtwarzaczem i sam nie dostarcza żadnej treści. Korzystaj wyłącznie ze źródeł, do których jesteś upoważniony.
Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert. Intro-Zeiten: TheIntroDB.¦Ten produkt wykorzystuje interfejs API TMDB, ale nie jest zatwierdzony ani certyfikowany przez TMDB. Godziny wprowadzenia: TheIntroDB.
Systemeinstellungen der App¦Ustawienia systemowe aplikacji
Setzt Ansicht, Design, Menü, Player, Ton und Start auf die Standardwerte. Playlists, Favoriten, Verlauf und Fortsetzen-Positionen bleiben erhalten. Zwischenspeicher leerst du unter „Speicher“.¦Resetuje widok, projekt, menu, odtwarzacz, dźwięk i start do ustawień domyślnych. Listy odtwarzania, ulubione, historia i pozycje wznowienia są zachowywane. Wyczyść pamięć podręczną w „Pamięć”.
Directing¦Reżyseria
Acting¦Obsada
Writing¦Scenariusz
Director¦Reżyser
anzeigen ›¦pokaż ›
Download fehlgeschlagen (HTTP {0})¦Pobieranie nie powiodło się (HTTP {0})
Datei unplausibel¦Plik nieprawdopodobny
Offline oder nicht erreichbar¦Offline lub nieosiągalny
{0} Trailer¦{0} zwiastunów
Ratings¦Oceny
Source¦Źródło
Value¦Wartość
Episodes¦Odcinki
Episode¦Odcinek
Serif¦Szeryfowa
Leicht¦Lekka
Monospace¦O stałej szerokości
Sehr groß¦Bardzo duży
Riesig¦Ogromny
Wiedergabe:¦Odtwarzanie:
Keine Programmdaten erhalten¦Nie wczytano danych EPG
Zurück mit der Zurück-Taste.¦Wróć klawiszem Wstecz.
Deutsch¦niemiecki
Englisch¦angielski
Japanisch¦japoński
Koreanisch¦koreański
Französisch¦francuski
Spanisch¦hiszpański
Türkisch¦turecki
Kroatisch¦chorwacki
Serbisch¦serbski
Bosnisch¦bośniacki
Weiß¦Biały
Gelb¦Żółty
Grün¦Zielony
Cyan¦Cyjan
Pink¦Różowy
Schwarz¦Czarny
Keiner¦Brak
Kein¦Brak
Halbtransparent¦Półprzezroczysty
Schatten¦Cień
Kontur¦Obrys
Action¦Akcja
Abenteuer¦Przygoda
Komödie¦Komedia
Krimi¦Kryminał
Dokumentation¦Dokument
Drama¦Dramat
Familie¦Rodzina
Fantasy¦Fantazja
Historie¦Historia
Horror¦Przerażenie
Musik¦Muzyka
Mystery¦Tajemnica
Romantik¦Romans
Thriller¦Thriller
Krieg¦Wojna
Western¦Zachodni
Kinder¦Dzieci
Nachrichten¦Wiadomości
Reality¦Reality show
Soap¦Telenowela
Untertitel-Stil¦Styl napisów
Wiedergabe-Tempo¦Prędkość odtwarzania
ansehen¦oglądaj
schließen¦zamknij
JETZT¦TERAZ
BEENDET¦ZAKOŃCZONE
Letzter Absturz¦Ostatnia awaria
wenig¦niska
mittel¦średnia
viel¦wysoka
keiner¦brak
Sleep-Timer¦Wyłącznik czasowy
Letzter Kanal¦Ostatni kanał
Kein Kanal mit dieser Nummer¦Brak kanału o tym numerze
Zurück zu Live¦Wracamy do żywych
LIVE¦NA ŻYWO
Profile¦Profile
Verlauf, Favoriten, Jugendschutz je Person¦Historia, ulubione, kontrola rodzicielska na osobę
Wer schaut?¦Kto ogląda?
Hauptprofil¦Profil główny
Wechseln¦Przełącz
Profil hinzufügen¦Dodaj profil
Name des Profils¦Nazwa profilu
Beim Start fragen: Wer schaut?¦Zapytaj na początku: kto ogląda?
Zeigt beim Öffnen der App die Profilauswahl, sobald es mehr als ein Profil gibt.¦Pokazuje wybór profilu podczas otwierania aplikacji, jeśli istnieje więcej niż jeden profil.
Beim Wechseln startet die App kurz neu.¦Podczas przełączania aplikacja uruchamia się na chwilę ponownie.
Jedes Profil hat eigenen Verlauf, eigene Favoriten, Ansicht, Player-Einstellungen und eigenen Jugendschutz. Playlist, Sprache und Aktualisierung sind für alle gleich.¦Każdy profil ma swoją historię, ulubione, widok, ustawienia gracza i kontrolę rodzicielską. Lista odtwarzania, język i odświeżanie są takie same dla wszystkich.
Sicherung¦Kopia zapasowa
Sicherung erstellen¦Utwórz kopię zapasową
Sicherung wiederherstellen¦Przywróć kopię zapasową
Sicherung fehlgeschlagen.¦Tworzenie kopii zapasowej nie powiodło się.
Keine gültige Sicherung gefunden.¦Nie znaleziono prawidłowej kopii zapasowej.
Gesichert werden Einstellungen, Favoriten, Verlauf, Weiterschauen und Profile. Playlists und Zugangsdaten sind nicht enthalten. Beim Wiederherstellen startet die App neu.¦Ustawienia, ulubione, historia, kontynuuj oglądanie i kopie zapasowe profili. Listy odtwarzania i dane uwierzytelniające nie są uwzględniane. Aplikacja uruchamia się ponownie podczas przywracania.
Standard-Ansicht¦Domyślny widok
Oberfläche aktuell ×{0} (Bildschirm {#1} dp breit).¦Interfejs obecnie ×{0} (ekran o szerokości {#1} dp).
Standard ist 85 %: mehr Inhalt, Elemente bleiben gut lesbar. „Automatisch“ vergrößert die App auf sehr breiten Bildschirmen.¦Wartość domyślna to 85%: więcej treści, elementy pozostają łatwe do odczytania. „Automatyczny” powiększa aplikację na bardzo szerokich ekranach.
Zuletzt aktualisiert¦Ostatnia aktualizacja
Nächste Aktualisierung¦Następna aktualizacja
Bereit¦Gotowe
Lade…¦Ładowanie…
läuft¦odtwarzanie
Startet in {#0} s¦Zaczyna się za {#0} s
Gespeichert¦Zapisano
Anbieter-Kategorien¦Kategorie dostawcy
Auto-Genres¦Automatyczne gatunki
bereit¦gotowe
aktiv¦aktywny
keine¦brak
Installiert¦Zainstalowano
Oder vom Handy senden (gleiches WLAN):¦Lub wyślij z telefonu (to samo Wi-Fi):
Bitte mit dem Internet verbinden¦Połącz się z Internetem
So schaltest du IPVIO Stream frei – ohne etwas am Fernseher zu tippen:¦Jak odblokować strumień IPVIO – bez wpisywania czegokolwiek na telewizorze:
1.  Öffne auf deinem Handy diese Adresse:¦1. Otwórz ten adres na swoim telefonie:
3.  Dieser Bildschirm schaltet sich danach automatisch frei.¦3. Ten ekran odblokowuje się później automatycznie.
Prüfe …¦Sprawdzam…
Erneut prüfen¦Sprawdź ponownie
Neuen Code anfordern¦Poproś o nowy kod
Testphase: noch {#0} Tage¦Wersja próbna: pozostało {#0} dni
Testphase: noch {#0} Tag¦Wersja próbna: pozostał {#0} dzień
Entwicklung (ohne Prüfung)¦Rozwój (bez sprawdzania)
Gültig¦Ważne
dauerhaft¦na stałe
Gültig bis¦Ważne do Pozostało
noch {#0} Tage¦{#0} dni
Öffne auf dem Handy:¦Otwórz na swoim telefonie:
Der Link gilt 30 Minuten. Nach der Zahlung schaltet sich dieses Gerät automatisch frei.¦Link jest ważny przez 30 minut. Po dokonaniu płatności urządzenie odblokowuje się automatycznie.
Geräte ({#0} von {#1})¦Urządzenia ({#0} z {#1})
dieses Gerät¦tego urządzenia
Entfernen¦Usuń
Mit „Entfernen“ wird ein Platz frei, zum Beispiel für einen neuen Fernseher.¦„Usuń” zwalnia miejsce, na przykład na nowy telewizor.
Talk¦Talk show
Wien¦Wiedeń
Zürich¦Zurych
Belgrad¦Belgrad
Athen¦Ateny
Bukarest¦Bukareszt
Lissabon¦Lizbona
Moskau¦Moskwa
Tokio¦Tokio
Seoul¦Seul
Mexiko-Stadt¦Meksyk
Indien¦Indie
Schnell {0}¦Szybki {0}
Vancouver¦Vancouver
Private Version¦Wersja prywatna
Zu viele Fehlversuche. Bitte in {#0} s erneut versuchen.¦Zbyt wiele błędnych prób. Spróbuj ponownie za {#0} s.
Bitte eine gültige Adresse eingeben (beginnt mit http:// oder https://).¦Proszę wprowadzić prawidłowy adres (zaczynający się od http:// lub https://).
Angaben unvollständig: Server, Benutzername und Passwort nötig.¦Szczegóły niekompletne: wymagany jest serwer, nazwa użytkownika i hasło.
Der Server hat keine Daten geliefert.¦Serwer nie zwrócił żadnych danych.
Keine Sender in der Playlist gefunden.¦Na liście odtwarzania nie znaleziono kanałów.
Zugang abgelehnt ({#0}). Benutzername, Passwort oder Abo prüfen.¦Odmowa dostępu ({#0}). Sprawdź nazwę użytkownika, hasło lub subskrypcję.
Playlist nicht gefunden (404). Adresse prüfen.¦Nie znaleziono playlisty (404). Sprawdź adres.
Der Anbieter begrenzt gerade die Verbindungen ({#0}). Später erneut versuchen.¦Dostawca obecnie ogranicza połączenia ({#0}). Spróbuj ponownie później.
Laden fehlgeschlagen.¦Ładowanie nie powiodło się.
Laden fehlgeschlagen ({0}).¦Ładowanie nie powiodło się ({0}).
Server nicht gefunden. Adresse und Internetverbindung prüfen.¦Nie znaleziono serwera. Sprawdź adres i połączenie internetowe.
Zeitüberschreitung: Der Server antwortet nicht.¦Limit czasu: serwer nie odpowiada.
Keine Verbindung zum Server.¦Brak połączenia z serwerem.
Sichere Verbindung fehlgeschlagen (Zertifikat).¦Bezpieczne połączenie nie powiodło się (certyfikat).
Ungültige Adresse.¦Nieprawidłowy adres.
Die Playlist ist zu groß für den Speicher dieses Geräts.¦Lista odtwarzania jest za duża dla pamięci tego urządzenia.
Verbindung unterbrochen. Bitte erneut versuchen.¦Połączenie zostało przerwane. Spróbuj ponownie.
Verbindung wieder da – lade neu …¦Połączenie wróciło – ładuję ponownie…
Bildschirm kann nicht wach gehalten werden – der Bildschirmschoner kann starten.¦Nie można utrzymać włączonego ekranu – może uruchomić się wygaszacz ekranu.
Automatische Genres brauchen den TMDB-Schlüssel (Datei secrets.properties im Projektordner).¦Gatunki automatyczne wymagają klucza TMDB (plik secrets.properties w folderze projektu).
Bildschirm wach¦Ekran pozostaje włączony
an¦włączone
aus¦wyłączone
Dieses Profil ist durch den Jugendschutz gesperrt. Profile wechseln und bearbeiten geht nur mit der PIN.¦Ten profil jest zablokowany przez kontrolę rodzicielską. Przełączanie i edytowanie profili wymaga podania kodu PIN.
Das zuletzt genutzte Profil ist durch den Jugendschutz gesperrt. Zum Wechseln bitte dessen PIN eingeben.¦Ostatnio używany profil jest blokowany przez kontrolę rodzicielską. Wprowadź PIN, aby się przełączyć.
Eigene Farben¦Kolory niestandardowe
Farbe 1 · Flächen¦Kolor 1 · Powierzchnie
Farbe 2 · Hervorhebung¦Kolor 2 · Podświetlenie
Farbe 2 · automatisch¦Kolor 2 · automatyczny
Farbe 2 ist auf diesem Hintergrund schwer lesbar.¦Kolor 2 jest trudny do odczytania na tym tle.
Farbe 1 färbt Knöpfe, Balken und markierte Flächen – die Schrift darauf wird automatisch hell oder dunkel, damit sie lesbar bleibt. Farbe 2 färbt Hervorhebungen, Rahmen und farbige Schrift. „Automatisch“ berechnet Farbe 2 passend zu Farbe 1.¦Kolor 1 jest używany dla przycisków, pasków i wybranych powierzchni – tekst na nim automatycznie zmienia kolor na jasny lub ciemny, dzięki czemu pozostaje czytelny. Kolor 2 jest używany do wyróżnień, obramowań i kolorowego tekstu. „Automatycznie” oblicza kolor 2, aby dopasować kolor 1.
IPVIO Navy¦Marynarka Wojenna IPVIO
Einfacher mit dem Handy¦Łatwiej korzystać z telefonu
Mit der Fernbedienung zu tippen ist mühsam. Schick die Zugangsdaten lieber vom Handy:¦Pisanie na pilocie jest nudne. Zamiast tego wyślij szczegóły ze swojego telefonu:
Handy mit demselben WLAN verbinden wie dieses Gerät.¦Połącz swój telefon z tą samą siecią Wi-Fi co to urządzenie.
Im Browser des Handys diese Adresse öffnen:¦Otwórz ten adres w przeglądarce telefonu:
Den Code von hier eingeben:¦Wpisz pokazany tutaj kod:
Zugangsdaten eintragen und senden. Die Playlist wird danach automatisch geladen.¦Wypełnij dane i wyślij. Następnie playlista ładuje się automatycznie.
Die Übertragung vom Handy ist gerade nicht verfügbar. Das Gerät muss mit dem WLAN verbunden sein.¦Przesyłanie z telefonu jest teraz niedostępne. Połącz to urządzenie z Wi-Fi.
Code¦Kod
Playlist wird geladen¦Wczytywanie playlisty
Verbindung zum Server wird aufgebaut …¦Łączenie z serwerem…
Sender werden heruntergeladen …¦Pobieranie kanałów…
Kategorien werden sortiert …¦Sortowanie kategorii…
Playlist wird gespeichert …¦Zapisywanie playlisty…
heruntergeladen¦pobrano
Große Playlists können bis zu einer Minute dauern.¦Duże listy odtwarzania mogą zająć nawet minutę.
Deine Bibliothek ist für automatische Genres zu groß (über 60.000 Filme und Serien). Es werden die Kategorien deines Anbieters verwendet. Blende unten Sprachen aus, die du nicht brauchst – dann passt es wieder.¦Twoja biblioteka jest zbyt duża dla automatycznych gatunków (ponad 60 000 filmów i seriali). Zamiast tego używane są kategorie Twojego dostawcy. Ukryj poniżej języki, których nie potrzebujesz – wtedy znów będzie pasować.
Sprachen der Inhalte¦Języki treści
Blende Sprachen aus, die du nicht brauchst – sie verschwinden dann überall: Startseite, Filme, Serien, Live-TV und Suche. Erkannt wird die Kennzeichnung deines Anbieters (z. B. „DE |“, „[TR]“, „GERMAN“). Das ist bei IPTV-Anbietern die Sprache der Tonspur, nicht das Herkunftsland des Films.¦Ukryj niepotrzebne języki – znikają wszędzie: w domu, filmach, serialach, telewizji na żywo i wyszukiwarce. Wykrywanie wykorzystuje etykiety Twojego dostawcy (np. „DE |”, „[TR]”, „GERMAN”). W przypadku dostawców IPTV jest to język ścieżki dźwiękowej, a nie kraj pochodzenia filmu.
Sprachen werden gezählt …¦Liczenie języków…
Noch keine Playlist geladen.¦Nie załadowano jeszcze żadnej listy odtwarzania.
Nur meine Sprache¦Tylko mój język
Alle zeigen¦Pokaż wszystko
Ohne Kennung¦Bez oznaczenia języka
Genres, Sprachen der Inhalte¦Gatunki, języki treści
Genres werden erkannt¦Wykrywanie gatunków
Länder werden ergänzt¦Dodawanie krajów
Automatische Genres sind für diese Auswahl ausgeschaltet¦Dla tego wyboru wyłączone są automatyczne gatunki
Deine Bibliothek hat {#0} Filme und Serien – die Grenze für automatische Genres liegt bei {#1}. Blende in Einstellungen > Playlists > „Sprachen der Inhalte“ die Sprachen aus, die du nicht brauchst. Danach werden die Genres im Hintergrund erkannt.¦Twoja biblioteka zawiera {#0} filmów i seriali – limit dla automatycznych gatunków wynosi {#1}. Wybierz Ustawienia > Listy odtwarzania > „Języki treści” i ukryj niepotrzebne języki. Gatunki są następnie wykrywane w tle.
Genres werden gerade im Hintergrund erkannt. Die Kategorien erscheinen nach und nach.¦W tle wykrywane są gatunki. Kategorie pojawiają się stopniowo.
Sprachauswahl wird angewendet …¦Stosowanie wyboru języka…
Ausgeblendete Sprachen werden gar nicht erst geladen. Das spart viel Arbeitsspeicher und macht große Playlists schneller.¦Ukryte języki w ogóle nie są ładowane. Oszczędza to dużo pamięci i przyspiesza odtwarzanie dużych list odtwarzania.
Mindestens eine Sprache muss sichtbar bleiben.¦Przynajmniej jeden język musi pozostać widoczny.
Geladen: {#0} Sender mit Programm (gekürzt, Speicher knapp)¦Załadowano: {#0} kanałów z programem (skrócony, mało pamięci)
Alle Sprachen dieser Playlist sind ausgeblendet¦Wszystkie języki tej listy odtwarzania są ukryte
Alle Sprachen zeigen¦Pokaż wszystkie języki
Neue Infos · aktualisieren¦Nowe dane · odświeżanie
Suche …¦Wyszukiwanie…
Profil {#0}¦Profil {#0}
Sende deine Playlist an den Fernseher. Den Code siehst du auf dem Bildschirm.¦Wyślij swoją playlistę do telewizora. Możesz zobaczyć kod na ekranie.
M3U-Link¦Łącze M3U
Code vom Fernseher¦Kod z telewizora
An den Fernseher senden¦Wyślij do telewizora
oder Xtream-Login¦lub login Xtream
Gesendet. Schau jetzt auf den Fernseher.¦Wysłano. Teraz spójrz na telewizor.
Falscher Code. Bitte zurück und erneut versuchen.¦Zły kod. Wróć i spróbuj ponownie.
Eingabe unvollständig oder ungültig.¦Dane wprowadzone niekompletne lub nieprawidłowe.
Zu viele Fehlversuche. Auf dem Fernseher neu starten.¦Zbyt wiele prób. Uruchom ponownie telewizor.
Laden¦Załaduj
Playlist wird heruntergeladen …¦Pobieranie listy odtwarzania…
Download wird fortgesetzt …¦Wznawianie pobierania…
Verbindung unterbrochen – neuer Versuch …¦Połączenie utracone – ponawianie próby…
Download konnte nicht fortgesetzt werden. Bitte erneut versuchen.¦Nie można wznowić pobierania. Spróbuj ponownie.
Playlist wird geprüft …¦Sprawdzam playlistę…
Titel werden eingelesen …¦Czytanie tytułów…
Gespeicherte Playlist wird gelesen …¦Czytanie zapisanej listy odtwarzania…
Sprachen auswählen¦Wybierz języki
Laden abgebrochen. Deine Angaben bleiben gespeichert.¦Ładowanie anulowane. Twoje dane pozostają zapisane.
Die gewählten Inhalte sind zu groß für den Speicher dieses Geräts. Bitte weniger Sprachen wählen.¦Wybrana zawartość jest za duża dla pamięci tego urządzenia. Wybierz mniej języków.
Zu wenig freier Speicherplatz auf dem Gerät. Bitte Platz schaffen (z. B. unbenutzte Apps löschen) und erneut versuchen.¦Za mało wolnego miejsca na urządzeniu. Zwolnij miejsce (np. usuń nieużywane aplikacje) i spróbuj ponownie.
Noch einmal Zurück drücken zum Abbrechen¦Naciśnij ponownie przycisk Wstecz, aby anulować
Deine Angaben sind gespeichert – bei einer Unterbrechung geht es beim nächsten Start weiter.¦Twoje dane zostały zapisane – w przypadku przerwania ładowanie będzie kontynuowane przy następnym uruchomieniu.
Bitte mindestens eine Sprache wählen.¦Proszę wybrać przynajmniej jeden język.
Passt in den Speicher dieses Geräts.¦Pasuje do pamięci tego urządzenia.
Das Laden wurde mehrmals unterbrochen. Deine Angaben sind gespeichert – drücke „Hinzufügen“, um es erneut zu versuchen.¦Ładowanie zostało kilkakrotnie przerwane. Twoje dane zostały zapisane – naciśnij „Dodaj”, aby spróbować ponownie.
Meine Sprache zeigen¦Pokaż mój język
Welche Inhalte möchtest du sehen?¦Co chcesz obejrzeć?
Diese Playlist ist sehr groß: {#0} Titel in {#1} Sprachen.¦Ta playlista jest bardzo duża: {#0} tytułów w {#1} językach.
Wähle die Sprachen, die du sprichst – dann zeigt dir die App nur Filme, Serien und Sender in diesen Sprachen. Das Laden geht deutlich schneller und braucht weniger Speicher. Ändern kannst du das jederzeit unter Einstellungen > Sprachen.¦Wybierz języki, którymi mówisz – aplikacja będzie wtedy wyświetlać tylko filmy, seriale i kanały w tych językach. Ładowanie jest znacznie szybsze i wymaga mniej pamięci. Możesz to zmienić w dowolnym momencie w Ustawieniach > Języki.
Alles laden¦Wczytaj wszystko
„Alles laden“ lädt alle {#0} Titel. Das kann einige Minuten dauern.¦„Załaduj wszystko” ładuje wszystkie {#0} tytuły. Może to potrwać kilka minut.
Markiere die Sprachen, deren Titel du sehen möchtest. Erkannt wird die Kennzeichnung deines Anbieters (z. B. „DE |“ oder „[TR]“) – bei IPTV ist das die Sprache der Tonspur, nicht das Herkunftsland.¦Wybierz języki, których tytuły chcesz zobaczyć. Aplikacja korzysta z etykiet Twojego dostawcy (np. „DE |” lub „[TR]”) – w przypadku IPTV jest to język dźwięku, a nie kraj pochodzenia.
Gewählt: {#0} Titel¦Wybrano: {#0} tytułów
Sehr groß für dieses Gerät – das Laden kann lange dauern.¦Bardzo duży jak na to urządzenie – ładowanie może zająć dużo czasu.
Diese Auswahl ist sehr groß für dieses Gerät – das Laden kann lange dauern.¦Wybór jest bardzo duży dla tego urządzenia – ładowanie może zająć dużo czasu.
Die Sprachauswahl erscheint, sobald der Download fertig ist.¦Wybór języka pojawi się zaraz po zakończeniu pobierania.
Das dauert ungewöhnlich lange. Mit der Sprachauswahl lädst du nur die Titel, die du wirklich brauchst.¦To trwa niezwykle długo. Dzięki wyborowi języka ładujesz tylko te tytuły, których naprawdę potrzebujesz.
Sprachen wählen¦Wybierz języki
Weiter warten¦Czekaj dalej
Aus = Kategorien deines Anbieters (Standard). Umschalten geht auch direkt in der Ansicht „Kategorien“.¦Wył. = kategorie Twojego dostawcy (domyślnie). Możesz także przełączać się bezpośrednio w widoku „Kategorie”.
Folgen {0}¦Odcinki {0}
{#0} Abschnitte¦{#0} sekcji
Links/Rechts = Abschnitt wechseln¦Lewo/Prawo = zmiana sekcji
Zu Folge springen¦Skocz do odcinka
Gehe zu Folge …¦Przejdź do odcinka…
Folgennummer¦Numer odcinka
Springen¦Idź
Fortsetzen¦Wznów
Gesehen¦Obejrzane
Weiter mit {0}¦Kontynuuj za pomocą {0}
Als Nächstes¦Następny
Menü-Taste oder OK lange drücken = entfernen¦Przycisk Menu lub przytrzymaj OK = usuń
Aus „Weiterschauen“ entfernt¦Usunięto z „Kontynuuj oglądanie”
Rechts / Vorspulen = 50 weiter¦W prawo / przewijanie do przodu = 50 do przodu
Zurückspulen = zurück¦Przewijanie wstecz = powrót
Links schließt¦Strzałka w lewo zamyka
Italienisch¦włoski
Portugiesisch¦portugalski
Polnisch¦polski
Russisch¦Rosyjski
Arabisch¦arabski
Niederländisch¦holenderski
Keine¦Brak
Zweite Tonspur¦Drugi język audio
Wie die App-Sprache¦Taki jak język aplikacji
Immer an¦Zawsze włączone
Nur bei fremder Tonspur¦Tylko przy obcojęzycznej ścieżce audio
Sprache der Untertitel¦Język napisów
Untertitel für Hörgeschädigte (CC)¦Napisy dla niedosłyszących (CC)
Bevorzugt Untertitel mit Geräuschen und Sprecherangaben ([Musik], [Tür knallt]), wenn der Stream welche hat.¦Woli napisy z dźwiękami i etykietami głośników ([muzyka], [trzaskanie drzwiami]), jeśli strumień je zawiera.
"""

internal val DictPl3 = """
„Nur bei fremder Tonspur“: Läuft ein Titel in einer Sprache, die du nicht eingestellt hast (z. B. Japanisch), erscheinen Untertitel automatisch; bei deiner Sprache bleiben sie aus. Wählst du im Player unter Audio & Untertitel von Hand, merkt sich die App das für diese Serie bzw. diesen Film – die nächste Folge startet gleich richtig.¦„Tylko dla zagranicznego dźwięku”: jeśli tytuł jest odtwarzany w języku, którego nie ustawiłeś (np. japoński), napisy pojawiają się automatycznie; w Twoim języku są wyłączone. Jeśli wybierzesz ręcznie w odtwarzaczu w sekcji Dźwięk i napisy, aplikacja zapamięta to dla tego serialu lub filmu – następny odcinek rozpocznie się od razu zgodnie z Twoim wyborem.
Quelle & Qualität¦Źródło i jakość
Bei mehreren Quellen¦Z kilku źródeł
Automatisch (passend zum Gerät)¦Automatyczny (pasuje do tego urządzenia)
Immer die höchste¦Zawsze najwyższa
Höchstens Full HD¦Maksymalnie Full HD
Höchstens HD (spart Daten)¦Maksymalnie HD (oszczędza transfer)
Bei Störung automatisch wechseln¦Włącz automatycznie problemy
Ruckelt ein Titel mehrmals oder lässt er sich nicht abspielen, nimmt die App eine andere (kleinere) Quelle desselben Titels – an derselben Stelle.¦Jeśli tytuł wielokrotnie się zacina lub nie chce się odtwarzać, aplikacja pobiera inne (mniejsze) źródło tego samego tytułu – w tej samej pozycji.
Dieses Gerät¦To urządzenie
4K-Bildschirm¦Ekran 4K
Full-HD-Bildschirm¦Ekran Full HD
HD-Bildschirm¦ekran HD
Bildschirm unbekannt¦Ekran nieznany
4K-Decoder¦Dekoder 4K
ja¦tak
nein¦nie
Gelernt: 4K ruckelte hier mehrmals – Automatik nimmt höchstens Full HD.¦Dowiedziałem się: 4K zacinało się tutaj kilka razy – tryb automatyczny wybiera teraz co najwyżej Full HD.
Viele Anbieter haben denselben Film mehrfach (4K, FHD, HD). „Automatisch“ nimmt die beste Quelle, die dein Gerät flüssig schafft: 4K nur mit 4K-Bildschirm und passendem Decoder. Eine feste Wahl auf der Detailseite hat immer Vorrang.¦Wielu dostawców udostępnia ten sam film kilka razy (4K, FHD, HD). „Automatyczny” wybiera najlepsze źródło, które płynnie odtwarza Twoje urządzenie: 4K tylko z ekranem 4K i odpowiednim dekoderem. Ustalony wybór na stronie szczegółów zawsze wygrywa.
Defekte Links¦Niedziałające źródła
Keine gestörten Titel bekannt.¦Nie są znane żadne uszkodzone tytuły.
{#0} Titel als gestört gemerkt¦{#0} tytułów oznaczonych jako uszkodzone
Gestörte Titel ausblenden¦Ukryj uszkodzone tytuły
Blendet Filme und Sender aus, die beim Abspielen „nicht mehr vorhanden“ meldeten oder mehrmals scheiterten. Sonst tragen sie ein Warnsymbol.¦Ukrywa filmy i kanały, które zgłaszały, że są „już niedostępne” lub kilka razy zakończyły się niepowodzeniem. W przeciwnym razie wyświetlają znak ostrzegawczy.
Liste leeren¦Wyczyść listę
Die App prüft nicht von sich aus Tausende Links – das würde dein Anbieter als Missbrauch werten. Sie merkt sich nur, was beim Abspielen schiefging. Ohne Internet, bei Zugangs- oder Serverproblemen wird nichts gemerkt. Spielt ein Titel wieder, ist er sofort freigegeben.¦Aplikacja nie sprawdza samodzielnie tysięcy linków – Twój dostawca potraktowałby to jako nadużycie. Pamięta tylko, co poszło nie tak podczas odtwarzania. Nic nie jest nagrywane bez Internetu lub przy problemach z logowaniem lub serwerem. Gdy tylko tytuł zostanie odtworzony ponownie, zostanie on usunięty.
Bildspur¦Ścieżka wideo
{#0} Quellen¦{#0} źródeł
Gestört¦Niedostępne
{0} – wechsle auf {1}¦{0} – przejście do {1}
Quelle gestört¦Źródło nie działa
Ruckelt¦Zacinanie obrazu
Format nicht abspielbar¦Nie można odtworzyć tego formatu
andere Quelle¦inne źródło
{0} passt nicht zu diesem Gerät – spiele {1}¦{0} nie pasuje do tego urządzenia – odtwarzam {1}
Diese Qualität¦Ta jakość
Quelle gestört – spiele eine andere¦Źródło uszkodzone – odtwarzam inne
bei Störung wird automatisch gewechselt¦automatycznie włącza problemy
Diese Quelle war zuletzt nicht erreichbar – es wird eine andere genommen.¦Ostatnim razem to źródło było nieosiągalne – zostanie użyte inne.
Diese Quelle war zuletzt nicht erreichbar.¦To źródło było ostatnim razem nieosiągalne.
Spulen, Intro, Qualität, defekte Links¦Przewijanie, czołówka, jakość, niedziałające źródła
Sprachen, CC, Untertitel-Stil¦Języki, napisy dla niesłyszących, styl napisów
Neue Senderliste¦Nowa lista kanałów
Neue Senderliste …¦Nowa lista kanałów…
Senderliste {#0}¦Lista kanałów {#0}
Liste löschen¦Usuń listę
Liste umbenennen¦Zmień nazwę listy
Name¦Imię
Speichern¦Zapisz
Zu Favoriten¦Dodaj do ulubionych
Nach oben¦Przesuń w górę
Nach unten¦Przesuń w dół
Aus „{0}“ entfernen¦Usuń z „{0}”
In „{0}“ – entfernen¦W „{0}” – usuń
Zu „{0}“¦Dodaj do „{0}”
Erinnern¦Przypomnij mi
Erinnerung löschen¦Usuń przypomnienie
Sender jetzt ansehen¦Obejrzyj kanał teraz
Erinnerung gesetzt – {#0} Min vorher¦Przypomnienie ustawione – {#0} min przed
Erinnerung gelöscht¦Przypomnienie usunięte
Erinnerung¦Przypomnienie
Erinnerungen¦Przypomnienia
ansehen / später: erinnern¦obejrzyj / później: przypomnij
Läuft jetzt¦Teraz na antenie
In {#0} Min¦Za {#0} min
Antippen öffnet den Sender¦Stuknij, aby otworzyć kanał
Umschalten¦Przełącz
Schließen¦Zamknij
Eigene Senderlisten¦Własne listy kanałów
Noch keine eigenen Listen.¦Nie ma jeszcze własnych list.
Zum Beginn¦Na początek
{#0} Min vorher¦{#0} min wcześniej
Keine Erinnerungen gesetzt.¦Nie ustawiono przypomnień.
Im TV-Guide auf einer späteren Sendung OK drücken > „Erinnern“. Ist die App offen, erscheint eine Karte mit „Umschalten“ (auch während du etwas anderes schaust). Ist sie geschlossen, kommt eine Benachrichtigung – antippen öffnet den Sender. Das Gerät muss dafür eingeschaltet sein (Standby reicht meist); manche Geräte zeigen Benachrichtigungen nur in ihrer Mitteilungsliste.¦W przewodniku telewizyjnym naciśnij OK w późniejszym programie > „Przypomnij mi”. Jeśli aplikacja jest otwarta, pojawi się karta z napisem „Przełącz” (nawet gdy oglądasz coś innego). Jeśli jest zamknięty, otrzymasz powiadomienie – dotknięcie go otwiera kanał. Urządzenie musi być włączone (zwykle wystarczy tryb gotowości); niektóre urządzenia wyświetlają tylko powiadomienia na liście powiadomień.
TV-Programm, Senderlisten, Erinnerungen¦Przewodnik telewizyjny, listy kanałów, przypomnienia
Film, Serie oder Sender sagen …¦Podaj film, serial lub kanał…
Sprechen¦Mów
Mit dem Handy suchen¦Szukaj za pomocą telefonu
Öffne auf dem Handy (gleiches WLAN):¦Otwórz na swoim telefonie (to samo Wi-Fi):
Code: {#0}¦Kod: {#0}
Dann tippen oder auf das Mikrofon der Handy-Tastatur tippen und sprechen. Der Begriff erscheint sofort hier.¦Następnie wpisz lub dotknij mikrofonu na klawiaturze telefonu i mów. Termin ten pojawia się tutaj od razu.
Gesucht¦Przeszukano
Film, Serie oder Sender¦Film, serial lub kanał
Tipp: Tippe auf das Mikrofon deiner Handy-Tastatur und sprich den Titel.¦Wskazówka: dotknij mikrofonu na klawiaturze telefonu i wypowiedz tytuł.
Läuft gerade ein Film oder Sender, wartet die Aktualisierung, bis du fertig bist – so ruckelt nichts.¦Jeśli odtwarzany jest film lub kanał, aktualizacja czeka, aż skończysz, więc nic się nie zacina.
Abdunkeln¦Przyciemnij
Ausblenden¦Ukryj
Archiv¦Archiwum
Archiv (Catchup)¦Archiwum (catch-up)
Archiv: verpasste Sendungen¦Archiwum: utracone programy
IM ARCHIV¦W ARCHIWUM
Deine Playlist meldet keine Sender mit Archiv.¦Twoja playlista nie zgłasza żadnych kanałów z archiwum.
{#0} Sender mit Archiv¦{#0} kanałów z archiwum
{#0} Tage¦{#0} dni
1 Tag¦1 dzień
Diese Sendung ist im Archiv des Anbieters nicht abrufbar.  Zurück = Live-Sender.¦Tego programu nie można odtworzyć z archiwum dostawcy.  Wstecz = kanał na żywo.
Kein Programm bekannt¦Brak informacji o programie
Keine vergangenen Sendungen im Programm.¦Brak wcześniejszych programów w przewodniku.
Nicht im Archiv verfügbar¦Niedostępne w archiwum
Nächste Sendung: Live¦Następny program: na żywo
Nächste Sendung: {0}¦Następny program: {0}
Vorherige Sendung¦Poprzedni program
Vorherige Sendung: {0}¦Poprzedni program: {0}
Von Anfang an¦Od początku
ansehen / Archiv / erinnern¦oglądaj / archiwizuj / przypominaj
Sender mit Archiv tragen das Archiv-Symbol. Im TV-Guide lassen sich vergangene Sendungen dieser Sender mit OK abspielen (Spulen-Tasten = einen Tag zurück/vor). Im Player: „Von Anfang an“ startet die laufende Sendung neu, „Archiv“ listet die verpassten Sendungen. Am Ende einer Sendung geht es mit der nächsten weiter, Zurück führt zum Live-Bild. Welche Sender ein Archiv haben und wie viele Tage es reicht, bestimmt dein Anbieter.¦Kanały z archiwum wyświetlają ikonę archiwum. W przewodniku telewizyjnym możesz odtwarzać wcześniejsze programy tych kanałów, naciskając przycisk OK (klawisze przewijania do tyłu/do przodu = jeden dzień do tyłu/do przodu). W odtwarzaczu „Od początku” uruchamia bieżący program, a „Archiwum” wyświetla listę pominiętych programów. Po zakończeniu programu rozpoczyna się następny; Powrót powoduje powrót do obrazu na żywo. Twój dostawca decyduje, które kanały mają archiwum i ile dni ono obejmuje.
Rating: beste zuerst¦Ocena: od najwyższej
Rating: schwächste zuerst¦Ocena: od najniższej
Jahr: neueste zuerst¦Rok: od najnowszych
Jahr: älteste zuerst¦Rok: od najstarszych
Noch keine Favoriten. Auf einem Sender OK gedrückt halten und „Zu Favoriten“ wählen.¦Nie ma jeszcze ulubionych. Przytrzymaj OK na kanale i wybierz „Dodaj do ulubionych”.
Diese Liste ist noch leer. In „Alle Sender“ oder einer Kategorie auf einem Sender OK gedrückt halten und „Zu …“ wählen.¦Ta lista jest nadal pusta. W obszarze „Wszystkie kanały” lub kategorii przytrzymaj OK na kanale i wybierz „Dodaj do…”.
Sender als Favorit: auf dem Sender OK gedrückt halten > „Zu Favoriten“. Kategorie als Favorit: auf der Kategorie OK gedrückt halten.¦Kanał jako ulubiony: przytrzymaj OK na kanale > „Dodaj do ulubionych”. Kategoria jako ulubiona: przytrzymaj OK na kategorii.
halten = Favorit / Listen¦przytrzymaj = ulubione / listy
Anlegen: Live TV > „Neue Senderliste“ oder auf einem Sender OK gedrückt halten > „Neue Senderliste …“. OK gedrückt halten auf einem Sender: Favorit, zu einer Liste hinzufügen oder entfernen, in der Liste nach oben/unten schieben. OK gedrückt halten auf einer Liste: umbenennen oder löschen. Hat deine Fernbedienung eine Menü-Taste, geht es auch damit. Im Player wechselst du mit Links zu deinen Listen; Umschalten bleibt in der Liste.¦Tworzenie: Telewizja na żywo > „Nowa lista kanałów” lub przytrzymaj OK na kanale > „Nowa lista kanałów…”. Przytrzymaj OK na kanale, aby dodać go do ulubionych, zmienić listę lub pozycję na liście. Przytrzymaj OK na liście, aby zmienić nazwę lub ją usunąć. Możesz też użyć przycisku Menu. W odtwarzaczu strzałka w lewo otwiera listy; przełączanie kanałów odbywa się w obrębie wybranej listy.
Abschnitt¦Sekcja
Staffel¦Sezon
1 Staffel¦1 sezon
{#0} Staffeln¦{#0} sezonów
1 Folge¦1 odcinek
{#0} Folgen¦{#0} odcinków
Alle Einstellungen zurücksetzen¦Zresetuj wszystkie ustawienia
Jetzt prüfen¦Sprawdź teraz
Letzten Film / letzte Serie beim Start fortsetzen¦Wznów ostatni film/serial na początku
Wenn du zuletzt einen Film oder eine Serie gesehen hast, läuft sie nach dem Start an der gemerkten Stelle weiter (bei einer fertigen Folge mit der nächsten).¦Jeśli ostatnio oglądałeś film lub serial, kontynuuj go od miejsca, w którym przerwałeś po rozpoczęciu (po skończonym odcinku, z następnym).
Aktuelles Design¦Aktualny projekt
Markiere eine Farbe, um sie hier zu sehen.¦Zaznacz kolor, aby zobaczyć go tutaj.
Nur Vorschau – OK übernimmt das Design.¦Tylko podgląd – OK, zastosuje projekt.
Neu¦Nowość
Automatische Genres, Kategorien¦Automatyczne gatunki, kategorie
Verwalten, Sprachen, Aktualisieren¦Zarządzaj, języki, aktualizacja
Sprachen der Inhalte öffnen¦Języki otwartej treści
Welche Sprachen geladen werden, stellst du unter „Playlists“ ein – das bestimmt, was aus der Playlist geladen wird.¦Wybierasz, które języki mają być ładowane w „Playlistach” – to decyduje o tym, co będzie ładowane z listy odtwarzania.
Deine Bibliothek ist für automatische Genres zu groß (über 60.000 Filme und Serien). Es werden die Kategorien deines Anbieters verwendet. Blende unter „Playlists“ > „Sprachen der Inhalte“ Sprachen aus, die du nicht brauchst – dann passt es wieder.¦Twoja biblioteka jest zbyt duża dla automatycznych gatunków (ponad 60 000 filmów i seriali). Zamiast tego używane są kategorie Twojego dostawcy. Ukryj niepotrzebne języki w sekcji „Playlisty” > „Języki treści” – wtedy znów będzie pasować.
Alle an¦Wszystko włączone
Alle aus¦Wszystko wyłączone
Übernehmen und laden¦Zastosuj i załaduj
Verwerfen¦Odrzuć
{#0} von {#1} Sprachen gewählt¦Wybrano {#0} z {#1} języków
{#0} Sender¦{#0} kanałów
{#0} Filme¦{#0} filmów
{#0} Serien¦{#0}
Aktuelle Liste¦Aktualna lista
Archiv deines Anbieters¦Archiwum Twojego dostawcy
Aufnahmen¦Nagrania
Aus dem Archiv ansehen¦Oglądaj z archiwum
Beliebte Filme¦Popularne filmy
Beliebte Serien¦Popularna seria
Deine Playlist meldet keine Sender mit Archiv. Wenn dein Anbieter ein Archiv (Catchup) anbietet, erscheinen die Sender hier nach dem nächsten Laden der Playlist.¦Twoja playlista nie zgłasza żadnych kanałów z archiwum. Jeśli Twój dostawca oferuje archiwum (nadrabianie zaległości), kanały pojawią się tutaj po ponownym załadowaniu listy odtwarzania.
Hallo, {0}¦Witam, {0}
Keine Erinnerungen¦Brak przypomnień
Live¦Na żywo
Nächste Sendungen¦Następne programy
Sendungen aus dem Archiv deines Anbieters¦Programy z archiwum Twojego dostawcy
Suche nach Sendern, Filmen, Serien …¦Szukaj kanałów, filmów, seriali…
Home¦Strona główna
EPG¦EPG
TV-Programm¦Przewodnik telewizyjny
Deine Auswahl¦Twoje typy
Noch nichts in deiner Liste. Auf der Seite eines Films oder einer Serie „Meine Liste“ wählen.¦Nie ma jeszcze nic na twojej liście. Wybierz „Moja lista” na stronie filmu lub serialu.
Zur Liste¦Dodaj do listy
OK lange drücken = entfernen¦Przytrzymaj OK = usuń
Heute¦Dzisiaj
Gestern¦Wczoraj
Zu Favoriten hinzugefügt¦Dodano do ulubionych
Aus Favoriten entfernt¦Usunięto z ulubionych
Links/Rechts = Spalte  ·  Zurück schließt¦Lewo/Prawo = kolumna · Tył zamyka się
laufender Sender, Kategorien, schließen¦aktualny kanał, kategorie, zamknij
Zurück: zum laufenden Sender, dann zu den Kategorien, dann schließen.¦Wróć: do bieżącego kanału, następnie do kategorii, a następnie zamknij.
Tag¦Dzień
Beispieltext¦Przykładowy tekst
Bilder bei Filmen und Serien¦Obrazy do filmów i seriali
Bildschirm füllen¦Wypełnij ekran
Cover¦Okładka
Favorit¦Ulubiony
Favoriten & Listen¦Ulubione i listy
Intro-Zeiten stammen aus der Community-Datenbank TheIntroDB und gibt es nicht für jede Serie. Die Stream-Info erscheint nur bei Filmen und Serien.¦Czasy wprowadzenia pochodzą z bazy danych społeczności TheIntroDB i nie są dostępne dla każdej serii. Informacje o strumieniu pojawiają się tylko w przypadku filmów i seriali.
Kartengröße¦Rozmiar karty
Markiere eine Einstellung, um sie hier zu sehen.¦Zaznacz ustawienie, aby je tutaj zobaczyć.
Noch keine Favoriten. Auf einem Sender OK gedrückt halten, bei Filmen und Serien auf der Detailseite „Zu Favoriten“ wählen.¦Nie ma jeszcze ulubionych. Przytrzymaj OK na kanale; w przypadku filmów i seriali wybierz „Dodaj do ulubionych” na stronie szczegółów.
Sender, Kategorie, schließen¦kanał, kategoria, zamknij
Szenenbild¦Nieruchomy obraz
Zoom 115 %¦Powiększ 115%
Zoom 133 %¦Powiększ 133%
Zurück schließt dieses Fenster¦Wstecz zamyka to okno
Zurück: zum Sender, dann zur Kategorie, dann schließen.¦Wróć: do kanału, potem do kategorii, potem zamknij.
Oben findest du alle Filme, Neuheiten, Top bewertet und Kategorien.¦Na górze znajdziesz wszystkie filmy, nowości, najwyżej oceniane i kategorie.
Oben findest du alle Serien, Neuheiten, Top bewertet und Kategorien.¦Na górze znajdziesz wszystkie serie, nowe dodatki, najwyżej ocenione i kategorie.
Titel pro Zeile¦Tytułów w wierszu
Schriftgröße (gilt für die ganze App)¦Rozmiar czcionki (dotyczy całej aplikacji)
Keine Benachrichtigungen¦Brak powiadomień
Erinnerung setzen¦Ustaw przypomnienie
Ansehen¦Oglądaj
Ansehen / Erinnerung¦Oglądaj / Przypomnienie
Alles rund um Aussehen, Wiedergabe und Konto¦Wszystko o wyglądzie, odtwarzaniu i koncie
{#0} Episoden¦{#0} odcinków
1 Episode¦1 odcinek
Neue Folge · Staffel {#0}, Folge {#1}¦Nowy odcinek · Sezon {#0}, odcinek {#1}
{#0} neue Folgen · bis Staffel {#1}, Folge {#2}¦{#0} nowe odcinki · aż do sezonu {#1}, odcinka {#2}
Es gibt nur {#0} Folgen¦Jest tylko {#0} odcinków
Verlauf · Filme¦Historia · Filmy
Verlauf · Serien¦Historia · Seriale
Noch nichts angesehen. Hier erscheinen die zuletzt gestarteten Filme und Serien.¦Nic jeszcze nie oglądane. Tutaj pojawiają się ostatnio rozpoczęte filmy i seriale.
Erneut abspielen¦Zagraj ponownie
Neue Folge¦Nowy odcinek
Vorschau beim Markieren¦Podgląd po ustawieniu ostrości
Top 10 · Im Trend¦Top 10 · Trendy
Neu hinzugefügt · Filme¦Ostatnio dodane · Filmy
Top bewertet · Filme¦Najwyżej oceniane · Filmy
Neu hinzugefügt · Serien¦Ostatnio dodane · Seriale
Top bewertet · Serien¦Najwyżej oceniane · Seriale
Favoriten · Sender¦Ulubione · Kanały
Favoriten · Filme¦Ulubione · Filmy
Favoriten · Serien¦Ulubione · Seriale
Meine Liste · Filme¦Moja lista · Filmy
Meine Liste · Serien¦Moja lista · Seriale
Jetzt ansehen¦Oglądaj teraz
Sender hinzufügen¦Dodaj kanały
Fertig¦Gotowe
Live TV · Jetzt und in den nächsten Stunden¦Telewizja na żywo · Teraz i w ciągu najbliższych godzin
Zurück: Sendung, Sender, Kategorie, dann schließen¦Wstecz: pokaż, kanał, kategoria, następnie zamknij
OK = ansehen  ·  halten = Favorit  ·  Links = Kategorien¦OK = oglądaj · przytrzymaj = ulubione · Lewo = kategorie
Anzeigen¦Pokaż
Schrift: Deckkraft¦Tekst: krycie
Hintergrund: Deckkraft¦Tło: krycie
Uhrzeit im Bild¦Zegar na ekranie
Technik-Info¦Informacje techniczne
Abspann automatisch überspringen¦Pomiń automatycznie kredyty
Uhrzeit: Ort¦Zegar: pozycja
Uhrzeit: Schrift-Deckkraft¦Zegar: nieprzezroczystość tekstu
Uhrzeit: Größe¦Zegar: rozmiar
Uhrzeit: Hintergrund¦Zegar: tło
Uhrzeit: Hintergrund-Deckkraft¦Zegar: nieprzezroczystość tła
Dunkler Kasten hinter der Uhr. Aus = nur die Zahlen.¦Ciemna skrzynka za zegarem. Wył. = tylko liczby.
Puffer (bei langsamem Internet)¦Bufor (dla wolnego Internetu)
Bildrate anpassen¦Dopasuj częstotliwość odświeżania
Ruckelt – Puffer wird beim nächsten Start größer¦Jąkanie – następnym razem bufor będzie większy
App-Aktualisierung¦Aktualizacja aplikacji
Adresse der Update-Datei (https://…/update.json)¦Adres pliku aktualizacji (https://…/update.json)
Nach Update suchen¦Sprawdź dostępność aktualizacji
Herunterladen und installieren¦Pobierz i zainstaluj
Du hast die neueste Version.¦Masz najnowszą wersję.
Bitte warten …¦Proszę czekać…
Installation gestartet¦Rozpoczęto instalację
Verbindung hängt – neuer Versuch¦Połączenie zawieszone – ponawianie próby
Titel pro Zeile (Kino)¦Tytułów w rzędzie (kino)
Rechts = nächste Staffel  ·  Links = Staffeln¦Prawo = następny sezon  ·  Lewo = sezony
Outfit¦Strój
Inter¦Inter
System¦Systemu
Noch keine Favoriten¦Brak ulubionych
Zu Live TV¦Przejdź do telewizji na żywo
Noch nichts in deiner Liste¦Nie ma jeszcze nic na Twojej liście
Filme entdecken¦Odkryj filmy
Noch nichts angesehen¦Nic jeszcze nie oglądane
Hier erscheinen die zuletzt gestarteten Filme und Serien.¦Tutaj pojawiają się ostatnio rozpoczęte filmy i seriale.
Auf einem Sender OK gedrückt halten, bei Filmen und Serien auf der Detailseite „Zu Favoriten“ wählen.¦Przytrzymaj OK na kanale; w przypadku filmów i seriali wybierz „Dodaj do ulubionych” na stronie szczegółów.
Auf der Seite eines Films oder einer Serie „Meine Liste“ wählen.¦Wybierz „Moja lista” na stronie filmu lub serialu.
Keine Treffer¦Brak wyników
Mit diesen Filtern gibt es hier keine Titel.¦Brak tytułów z tymi filtrami.
Filter zurücksetzen¦Zresetuj filtry
Diese Liste ist noch leer¦Ta lista jest jeszcze pusta
Auf einem Sender OK gedrückt halten und „Zu Favoriten“ wählen.¦Przytrzymaj OK na kanale i wybierz „Dodaj do ulubionych”.
In „Alle Sender“ oder einer Kategorie auf einem Sender OK gedrückt halten und „Zu …“ wählen.¦W „Wszystkie kanały” lub w kategorii przytrzymaj OK na kanale i wybierz „Dodaj do…”.
In dieser Kategorie gibt es keine Sender. Links eine andere Kategorie wählen.¦Brak kanałów w tej kategorii. Wybierz inną kategorię po lewej stronie.
Prüfe die Schreibweise oder suche nach einem Teil des Titels. Kleine Tippfehler findet die Suche trotzdem.¦Sprawdź pisownię lub wyszukaj część tytułu. Nadal znajdują się drobne literówki.
Outfit (Standard) und Inter sind in die App eingebaut, die übrigen Schriften stammen von deinem Gerät.¦Outfit (domyślnie) i Inter są wbudowane w aplikację, pozostałe czcionki pochodzą z Twojego urządzenia.
Top 10 heute¦Top 10 dzisiaj
Danach¦Dalej
Für diesen Sender gibt es kein Programm.¦Dla tego kanału nie ma przewodnika po programach.
FILM¦FILM
SERIE¦SERIAL
Runter für Details und Abspielen¦W dół: szczegóły i odtwarzanie
Links/Rechts = {#0} s springen¦Lewo/prawo = przewiń o {#0} s
2020er¦2020 rok
2010er¦2010 rok
2000er¦2000 rok
1990er¦Lata 90-te
Infos auf dem Poster¦Informacje na plakacie
Breites Szenenbild¦Szeroki obraz sceny
Neu: Version {0}¦Nowość: wersja {0}
Fehler {#0}¦Błąd {#0}
Keine Update-Adresse eingetragen¦Nie wprowadzono adresu aktualizacji
Update-Datei unvollständig¦Plik aktualizacji jest niekompletny
Leere Antwort¦Pusta odpowiedź
Lade … {#0} %¦Ładowanie… {#0}%
Erlaube der App einmal „Apps installieren“ und tippe dann erneut.¦Zezwól aplikacji raz na „Zainstaluj aplikacje”, a następnie spróbuj ponownie.
Trage die Adresse einer kleinen Datei update.json ein, die du selbst bereitstellst: {"versionCode": 2, "versionName": "1.1", "apk": "ipvio.apk"}. Die neue APK muss mit demselben Schlüssel signiert sein wie die installierte, sonst lehnt Android sie ab.¦Wpisz adres małego pliku update.json, który sam podałeś: {"versionCode": 2, "versionName": "1.1", "apk": "ipvio.apk"}. Nowy plik APK musi być podpisany tym samym kluczem, co zainstalowany, w przeciwnym razie Android go odrzuci.
Startet die nächste Folge, sobald der Abspann beginnt. Geht nur, wenn für die Serie Abspann-Zeiten bekannt sind (TheIntroDB); sonst bleibt es beim Hinweis in den letzten 30 Sekunden.¦Rozpoczyna następny odcinek zaraz po rozpoczęciu napisów końcowych. Działa tylko wtedy, gdy znane są czasy kredytowania serii (TheIntroDB); w przeciwnym razie podpowiedź otrzymasz tylko w ciągu ostatnich 30 sekund.
Zeigt die aktuelle Uhrzeit beim Abspielen in einer Ecke (nicht, solange die Steuerleiste offen ist).¦Pokazuje aktualny czas w rogu podczas odtwarzania (nie, gdy pasek sterowania jest otwarty).
Oben rechts¦Prawy górny róg
Oben links¦U góry po lewej
Unten rechts¦Na dole po prawej
Unten links¦Na dole po lewej
Die Uhr folgt der Zeitzone und dem 12/24-Stunden-Format aus den Einstellungen. Im Player geht es auch über Einstellungen > Uhrzeit.¦Zegar podąża za strefą czasową i formatem 12/24-godzinnym zgodnie z ustawieniami. W odtwarzaczu możesz także skorzystać z opcji Ustawienia > Zegar.
Ein größerer Puffer lädt mehr Film im Voraus und verhindert Ruckeln bei schwacher Leitung; dafür dauert der Start etwas länger und es wird mehr Speicher gebraucht. „Automatisch“ beginnt normal und vergrößert den Puffer von selbst, wenn es mehrfach ruckelt (aktuell Stufe {#0}). Gilt ab dem nächsten gestarteten Titel.¦Większy bufor ładuje większą część filmu z wyprzedzeniem i zapobiega zacinaniu się przy słabym połączeniu; w zamian start trwa nieco dłużej i zużywa się więcej pamięci. „Automatyczny” uruchamia się normalnie i sam powiększa bufor w przypadku powtarzających się zacięć odtwarzania (obecnie poziom {#0}). Obowiązuje od następnego tytułu, który zaczniesz.
"""

internal val DictPl4 = """
Passt die Bildwiederholrate des Fernsehers an den Film an (z. B. 24 Bilder), wenn der Fernseher das ohne Bildaussetzer kann. Bei Fire TV zusätzlich in den Geräteeinstellungen „Originale Bildrate anpassen“ prüfen.¦Dopasowuje częstotliwość odświeżania telewizora do filmu (np. 24 klatki), jeśli telewizor może to zrobić bez utraty obrazu. W Fire TV sprawdź także „Dopasuj oryginalną liczbę klatek na sekundę” w ustawieniach urządzenia.
{#0} min¦{#0} min
Quelle {#0}¦Źródło {#0}
Tonspur „{0}“ ist mit diesem Ausgang nicht abspielbar – andere Spur im Menü wählen¦Ścieżka audio „{0}” nie może być odtwarzana na tym wyjściu – wybierz inną ścieżkę w menu
Diese Tonspur kann hier nicht abgespielt werden – andere Spur gewählt¦Nie można tutaj odtworzyć tej ścieżki audio – wybrano inną ścieżkę
Verbindung hängt – neuer Versuch ({#0}/2)¦Połączenie zawieszone – spróbuj ponownie ({#0}/2)
Video-Rate (laut Datei): {0}¦Szybkość wideo (na plik): {0}
Ton: {0}¦Dźwięk: {0}
Puffer: {0}¦Bufor: {0}
Auto (5)¦Automatyczny (5)
Weil du „{0}“ geschaut hast¦Ponieważ oglądałeś „{0}”
Ähnlich wie {0}¦Podobny do {0}
Oben findest du alle {0}, Neuheiten, Top bewertet und Kategorien.¦Powyżej znajdziesz wszystkie {0}, nowości, najwyżej oceniane i kategorie.
Fortsetzen · {#0} Min¦Wznów · {#0} min
Weiter mit S{#0} · Folge {#1}¦Kontynuuj od S{#0} · Odcinek {#1}
noch nichts gemerkt¦nic jeszcze nie zostało zapamiętane
Liste angelegt. Mit „Sender hinzufügen“ füllen.¦Lista została utworzona. Wypełnij go „Dodaj kanał”.
Zu „¦Do „
“ hinzufügen: OK auf einem Sender fügt ihn hinzu bzw. entfernt ihn wieder¦”: naciśnij OK na kanale, aby go dodać lub usunąć
Entfernt¦Usunięto
Hinzugefügt¦Dodano
Diese Playlist ist sehr groß: {0} Titel in {#1} Sprachen.¦Ta playlista jest bardzo duża: {0} tytułów w {#1} językach.
„Alles laden“ lädt alle {0} Titel. Das kann einige Minuten dauern.¦„Załaduj wszystko” ładuje wszystkie {0} tytuły. Może to potrwać kilka minut.
Gewählt: {0} Titel¦Wybrano: {0} tytułów
Das dauert gerade sehr lange.¦To zajmuje naprawdę dużo czasu.
Sehr große Playlists brauchen lange. Mit der Sprachauswahl lädst du nur die Titel, die du wirklich brauchst.¦Ogromne playlisty mogą zająć wieki. Użyj wyboru języka, aby załadować tylko te tytuły, których faktycznie potrzebujesz.
Server nicht gefunden (DNS)¦Nie znaleziono serwera (DNS)
Sichere Verbindung fehlgeschlagen. Datum und Uhrzeit des Geräts prüfen¦Bezpieczne połączenie nie powiodło się. Sprawdź datę i godzinę urządzenia
Zeitüberschreitung, Server antwortet nicht¦Przekroczono limit czasu, serwer nie odpowiada
API-Schlüssel¦Klucze API
TMDB, IMDb und Rotten Tomatoes¦TMDB, IMDb i Rotten Tomatoes
Die App enthält keine eigenen Schlüssel. Mit deinen eigenen, kostenlosen Schlüsseln zeigt sie Poster, Beschreibungen, Besetzung, Trailer, automatische Genres sowie IMDb- und Rotten-Tomatoes-Wertungen. Ohne Schlüssel übernimmt sie Beschreibung, Cover und Bewertung von deinem Anbieter (bei Xtream-Zugängen).¦Aplikacja jest dostarczana bez żadnych kluczy. Za pomocą własnych bezpłatnych kluczy wyświetla plakaty, opisy, obsadę, zwiastuny, automatyczne gatunki oraz oceny IMDb i Rotten Tomatoes. Bez kluczy potrzebny jest opis, okładka i ocena od Twojego dostawcy (w przypadku loginów Xtream).
TMDB (Film-Infos)¦TMDB (informacje o filmie)
TMDB API-Schlüssel (v3)¦Klucz API TMDB (v3)
Kostenlos unter themoviedb.org: Konto anlegen, anmelden, dann Einstellungen > API > API-Schlüssel anfordern und den 32-stelligen „API Key“ eintragen. Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert.¦Bezpłatnie na themoviedb.org: utwórz konto, zaloguj się, wybierz Ustawienia > API > poproś o klucz API i wprowadź 32-znakowy „Klucz API”. Ten produkt wykorzystuje interfejs API TMDB, ale nie jest zatwierdzony ani certyfikowany przez TMDB.
OMDb (IMDb- und Rotten-Tomatoes-Wertung)¦OMDb (oceny IMDb i Rotten Tomatoes)
OMDb API-Schlüssel¦Klucz API OMDb
Kostenlos unter omdbapi.com > API Key (FREE). Danach den Aktivierungslink in der E-Mail anklicken, sonst funktioniert der Schlüssel nicht. Geht auch ohne TMDB-Schlüssel.¦Bezpłatnie na omdbapi.com > Klucz API (BEZPŁATNY). Następnie kliknij link aktywacyjny znajdujący się w wiadomości e-mail, w przeciwnym razie klucz nie zadziała. Działa również bez klucza TMDB.
Speichern und prüfen¦Zapisz i sprawdź
Schlüssel entfernen¦Usuń klucze
Schlüssel gültig¦Klucz ważny
Schlüssel ungültig¦Klucz nieprawidłowy
Keine Verbindung¦Brak połączenia
Die Schlüssel bleiben nur auf diesem Gerät. Nach dem Eintragen die App einmal neu starten, damit alle Bereiche die Infos laden. Intro- und Abspann-Zeiten kommen von TheIntroDB und brauchen keinen Schlüssel.¦Klucze pozostają tylko na tym urządzeniu. Po ich wprowadzeniu ponownie uruchom aplikację raz, aby wszystkie sekcje załadowały informacje. Czasy wprowadzenia i napisów końcowych pochodzą z TheIntroDB i nie wymagają klucza.
Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert. Wertungen: OMDb. Intro-Zeiten: TheIntroDB.¦Ten produkt wykorzystuje interfejs API TMDB, ale nie jest zatwierdzony ani certyfikowany przez TMDB. Oceny: OMDb. Godziny wprowadzenia: TheIntroDB.
IPVIO Stream ist freie Software unter der GNU General Public License v3 (GPL-3.0). Verwendete Bibliotheken: AndroidX/Jetpack Compose, Media3 (Apache 2.0), OkHttp, Coil (Apache 2.0), Jellyfin FFmpeg-Decoder (GPL-3.0), Schriften Outfit und Inter (SIL Open Font License).¦IPVIO Stream to darmowe oprogramowanie na licencji GNU General Public License v3 (GPL-3.0). Wykorzystane biblioteki: AndroidX/Jetpack Compose, Media3 (Apache 2.0), OkHttp, Coil (Apache 2.0), dekoder Jellyfin FFmpeg (GPL-3.0), czcionki Outfit i Inter (licencja SIL Open Font).
Automatische Genres brauchen einen TMDB-Schlüssel (Einstellungen > API-Schlüssel).¦Gatunki automatyczne wymagają klucza TMDB (Ustawienia > Klucze API).
Tipp: Unter Einstellungen > API-Schlüssel einen eigenen TMDB-Schlüssel eintragen, dann erscheinen hier Beschreibung, Cover und Bewertungen.¦Wskazówka: wprowadź własny klucz TMDB w Ustawieniach > Klucze API, aby zobaczyć tutaj opis, okładkę i oceny.
Zugang wird geprüft …¦Sprawdzam konto…
Sender werden geladen …¦Ładowanie kanałów…
Filme werden geladen …¦Ładowanie filmów…
Serien werden geladen …¦Ładowanie serii…
Serien werden geladen ({#0}/{#1}) …¦Ładowanie serii ({#0}/{#1}) …
Die Schnittstelle des Anbieters antwortet nicht wie erwartet.¦Interfejs dostawcy nie odpowiada zgodnie z oczekiwaniami.
Zugang abgelehnt. Benutzername, Passwort oder Abo prüfen.¦Odmowa dostępu. Sprawdź nazwę użytkownika, hasło lub subskrypcję.
Der Server hat keine gültige Playlist geliefert.¦Serwer nie zwrócił prawidłowej listy odtwarzania.
Update verfügbar: Version {0}¦Dostępna aktualizacja: wersja {0}
Update wird geladen …¦Pobieram aktualizację…
Installiert: Version {0}¦Zainstalowano: wersja {0}
Automatisch nach Updates suchen¦Automatycznie sprawdzaj dostępność aktualizacji
Einmal am Tag. Ein neues Update erscheint in der Glocke oben rechts.¦Raz dziennie. Nowa aktualizacja pojawi się w dzwonku w prawym górnym rogu.
Jetzt nach Update suchen¦Sprawdź teraz aktualizacje
Updates kommen von der Projektseite auf GitHub. Deine Playlists, Favoriten, der Verlauf und die Einstellungen bleiben bei einem Update erhalten. Android fragt vor der Installation einmal nach.¦Aktualizacje pochodzą ze strony projektu w GitHubie. Twoje playlisty, ulubione, historia i ustawienia zostaną zachowane podczas aktualizacji. Android pyta raz przed instalacją.
Eigene Update-Adresse (leer = GitHub)¦Niestandardowy adres aktualizacji (pusty = GitHub)
Noch keine Veröffentlichung gefunden¦Nie znaleziono jeszcze żadnego wydania
Dieses Stream-Format wird nicht unterstützt.¦Ten format strumienia nie jest obsługiwany.
Verbindung hängt – neuer Versuch ({#0})¦Połączenie zawieszone – ponawianie próby ({#0})
Verbindung unterbrochen – neuer Versuch ({#0})¦Połączenie utracone – ponowna próba ({#0})
Stream beendet – verbinde neu …¦Transmisja zakończona – ponowne łączenie…
Das Portal hat keine Abspiel-Adresse geliefert. Später erneut versuchen.¦Portal nie zwrócił adresu odtwarzania. Spróbuj ponownie później.
Zu wenig freier Speicher für den Live-Puffer¦Za mało wolnego miejsca dla aktywnego bufora
Zu wenig freier Speicher¦Za mało wolnego miejsca
Aufnahme läuft weiter – dafür braucht dein Anbieter 2 gleichzeitige Verbindungen¦Nagrywanie trwa – wymaga to 2 jednoczesnych połączeń od Twojego operatora
30 s zurück¦Wstecz 30 s
Aufnehmen¦Nagrywaj
Aufnahme beenden¦Zatrzymaj nagrywanie
Aufnahme gestartet¦Rozpoczęło się nagrywanie
Aufnahme beendet¦Nagrywanie zatrzymane
Aufnahme läuft¦Nagrywanie
Sender unbekannt¦Nieznany kanał
Aufnahmen ({#0})¦Nagrania ({#0})
Zurückspulen und Aufnehmen¦Przewiń i nagraj
Live TV zurückspulen¦Przewiń telewizję na żywo
Speichert den laufenden Sender auf dem Gerät. Dann kannst du pausieren, ohne etwas zu verpassen, mit den Spultasten zurückspringen und mit „Zurück zu Live“ wieder aufholen. Gilt für normale Live-Streams (nicht HLS).¦Zapisuje bieżący kanał na urządzeniu. Możesz wstrzymać, niczego nie tracąc, cofnąć się za pomocą klawiszy przewijania i dogonić „Powrót do życia”. Działa w przypadku normalnych transmisji na żywo (nie HLS).
Puffergröße¦Rozmiar bufora
Ungefähr: 512 MB reichen für 10–20 Minuten in HD. Der Puffer wird beim Schließen des Players gelöscht.¦Mniej więcej: 512 MB przez ostatnie 10–20 minut w jakości HD. Bufor jest usuwany po zamknięciu odtwarzacza.
Speicherort für Aufnahmen¦Przechowywanie nagrań
Nachlauf nach Sendungsende¦Dogrywka po zakończeniu programu
Aufnehmen: im Player bei einem Sender auf den roten Knopf. Die laufende Sendung wird bis zu ihrem Ende laut TV-Guide aufgenommen, beginnt sie schon im Puffer, auch von ihrem Anfang an. Schaust du währenddessen einen anderen Sender, braucht das eine zweite Verbindung zu deinem Anbieter. Aufnahmen liegen im App-Ordner und werden beim Deinstallieren der App gelöscht.¦Aby nagrać: naciśnij czerwony przycisk na kanale w odtwarzaczu. Bieżący program jest nagrywany do końca zgodnie z przewodnikiem telewizyjnym, od początku, jeśli nadal znajduje się w buforze. W międzyczasie oglądanie innego kanału wymaga drugiego połączenia z dostawcą. Nagrania są przechowywane w folderze aplikacji i usuwane po odinstalowaniu aplikacji.
Noch keine Aufnahmen.¦Brak jeszcze nagrań.
Stoppen¦Zatrzymaj
Abspielen: Live TV > „Aufnahmen“.¦Aby odtworzyć: Telewizja na żywo > „Nagrania”.
Interner Speicher¦Pamięć wewnętrzna
USB / Speicherkarte {#0}¦USB / karta pamięci {#0}
frei¦wolne
Verbindung beendet¦Połączenie zakończone
Puffer beendet¦Bufor się skończył
Puffer-Adresse ungültig¦Nieprawidłowy adres bufora
Mit anzeigen¦Pokazuj także
Nicht mehr mit anzeigen¦Przestań pokazywać
wird mit angezeigt¦także widoczna
„Mit anzeigen“ zeigt eine Playlist zusätzlich zur aktiven: Filme und Serien erscheinen zusammen (doppelte Filme nur einmal, gleiche Serien als eine Serie mit mehreren Quellen). In Filme und Serien filterst du über „Quelle“, im Live TV wechselst du die Quelle mit dem Knopf oben. Jede weitere Playlist braucht zusätzlich Speicher.¦„Pokaż także” dodaje listę odtwarzania do aktywnej: filmy i seriale pojawiają się razem (filmy zduplikowane tylko raz, ten sam serial jako jeden serial z kilku źródeł). W filmach i serialach filtrujesz według „Źródła”, w Live TV przełączasz źródło za pomocą przycisku u góry. Każda dodatkowa lista odtwarzania wymaga więcej pamięci.
Weitere Playlist wird geladen: {0}¦Ładowanie kolejnej listy odtwarzania: {0}
Zu wenig Speicher für eine weitere Playlist auf diesem Gerät.¦Za mało pamięci na inną listę odtwarzania na tym urządzeniu.
Kartengröße, Seitenleiste, Raster¦Rozmiar karty, pasek boczny, siatka
Karten¦Karty
Beim Markieren einer Auswahl zeigt die Vorschau sofort die Wirkung, OK übernimmt sie. Schriftgröße und Farben findest du unter „Design“.¦Po podświetleniu opcji podgląd natychmiast pokazuje efekt, OK, stosuje go. Rozmiar i kolory tekstu znajdują się w sekcji „Projekt”.
Seitenleiste¦Pasek boczny
Position¦Pozycja
Links¦W lewo
Rechts¦Jasne
Oben¦Góra
Immer mit Text¦Zawsze z tekstem
Aus: nur Symbole, die Texte erscheinen beim Hineingehen. An: Symbole und Texte sind immer zu sehen (braucht mehr Platz).¦Wył.: tylko ikony, etykiety pojawiają się po wejściu. Włącz: ikony i etykiety są zawsze widoczne (zajmują więcej miejsca).
Zurück bringt dich jederzeit in die Seitenleiste – auch wenn sie rechts oder oben steht.¦Wstecz zawsze przenosi Cię na pasek boczny – także wtedy, gdy znajduje się on po prawej stronie lub na górze.
Sport¦Sport
Jetzt live¦Teraz na żywo
Gleich¦Wkrótce
Sportsender¦Kanały sportowe
Keine Sportsender gefunden¦Nie znaleziono kanałów sportowych
Sportsender werden an Kategorie und Namen erkannt (z. B. „Sport“, „DAZN“, „Eurosport“). Sport-Sendungen erscheinen, sobald der TV-Guide geladen ist.¦Kanały sportowe są wykrywane według kategorii i nazwy (np. „Sport”, „DAZN”, „Eurosport”). Programy sportowe pojawiają się po załadowaniu przewodnika telewizyjnego.
TV-Guide wird noch geladen¦Przewodnik telewizyjny wciąż się ładuje
Stalker-Portal¦Portal prześladowców
Portal-Adresse (z. B. http://portal.tld:8080/c/)¦Adres portalu (np. http://portal.tld:8080/c/)
MAC-Adresse (z. B. 00:1A:79:12:34:56)¦Adres MAC (np. 00:1A:79:12:34:56)
Sender und Filme werden geladen (Serien noch nicht). Die MAC-Adresse bekommst du von deinem Anbieter.¦Kanały i filmy są załadowane (jeszcze nie seriale). Adres MAC otrzymasz od swojego dostawcy.
Angaben unvollständig: Portal-Adresse und MAC-Adresse (z. B. 00:1A:79:12:34:56) nötig.¦Niekompletny: potrzebny adres portalu i adres MAC (np. 00:1A:79:12:34:56).
Das Portal antwortet nicht. Adresse prüfen.¦Portal nie odpowiada. Sprawdź adres.
Das Portal lehnt diese MAC-Adresse ab. MAC und Abo beim Anbieter prüfen.¦Portal odrzuca ten adres MAC. Sprawdź adres MAC i subskrypcję u swojego dostawcy.
Das Portal hat keine Sender geliefert. MAC-Adresse und Abo beim Anbieter prüfen.¦Portal nie zwrócił żadnych kanałów. Sprawdź adres MAC i abonament u swojego dostawcy.
Filme werden geladen ({#0}) …¦Ładowanie filmów ({#0})…
Datei vom Gerät¦Plik z urządzenia
Auf diesem Gerät gibt es keine Dateiauswahl. Lade die Datei über die Handy-Seite rechts hoch.¦To urządzenie nie ma selektora plików. Prześlij plik, korzystając ze strony telefonu po prawej stronie.
Das ist keine gültige M3U-Datei.¦To nie jest prawidłowy plik M3U.
Die Playlist-Datei ist nicht mehr da. Bitte erneut hochladen.¦Plik listy odtwarzania zniknął. Prześlij go ponownie.
Playlist wird gelesen …¦Czytanie playlisty…
Zugangsdaten eintragen oder eine M3U-Datei hochladen und senden. Die Playlist wird danach automatisch geladen.¦Podaj swój login lub prześlij plik M3U i wyślij go. Następnie playlista ładuje się automatycznie.
Auf ein anderes Gerät übertragen¦Przenieś na inne urządzenie
Verlauf, Weiterschauen, Favoriten, Listen und Einstellungen mitnehmen – z. B. vom Fire TV auf das Handy. Auf Wunsch auch die Playlists mit Zugangsdaten.¦Zabierz ze sobą swoją historię, kontynuuj oglądanie, ulubione, listy i ustawienia – np. z Fire TV na telefon. Opcjonalnie także playlisty z loginami.
Übertragung im WLAN starten¦Rozpocznij transfer przez Wi-Fi
Übertragung beenden¦Zatrzymaj transfer
Das Gerät ist nicht mit einem WLAN verbunden.¦Urządzenie nie jest połączone z Wi-Fi.
Am Handy (im selben WLAN) öffnen:¦Otwórz na swoim telefonie (to samo Wi-Fi):
Altes Gerät: Sicherung herunterladen. Neues Gerät: hier ebenfalls starten und die Datei einspielen. Danach startet die App neu.¦Stare urządzenie: pobierz kopię zapasową. Nowe urządzenie: rozpocznij to również tutaj i prześlij plik. Następnie aplikacja uruchamia się ponownie.
Google Drive¦Dysk Google
Mit Google verbinden¦Połącz z Google
Am Handy öffnen und den Code eingeben:¦Otwórz na swoim telefonie i wpisz kod:
Die App speichert nur in ihrem eigenen, versteckten Ordner in deinem Google Drive und sieht sonst nichts.¦Aplikacja przechowuje tylko swoje własne ukryte foldery na Dysku Google i nie widzi niczego więcej.
Nicht verbunden (abgelehnt oder Zeit abgelaufen).¦Brak połączenia (odrzucono lub przekroczono limit czasu).
Verbunden.¦Połączono.
Letzte Sicherung: {0}¦Ostatnia kopia zapasowa: {0}
Playlists mit Zugangsdaten mitsichern¦Dołącz listy odtwarzania z loginami
Praktisch für ein neues Gerät. Die Zugangsdaten liegen dann in deinem Google Drive.¦Przydatny w przypadku nowego urządzenia. Twoje dane logowania zostaną następnie zapisane na Twoim Dysku Google.
Jetzt in Drive sichern¦Utwórz kopię na Dysku Google
Aus Drive wiederherstellen¦Przywróć z Dysku Google
Trennen¦Rozłącz
Sichern …¦Tworzenie kopii zapasowej…
Gesichert.¦Utworzono kopię zapasową.
Laden …¦Ładowanie…
In Drive gibt es noch keine Sicherung.¦Na Dysku nie ma jeszcze kopii zapasowej.
Die Sicherung in Drive ist ungültig.¦Kopia zapasowa na Dysku jest nieprawidłowa.
Google antwortet nicht¦Google nie odpowiada
Nicht mit Google verbunden¦Brak połączenia z Google
Auf dem Fernseher lässt sich die Zwischenablage oft nicht nutzen: Unter Einstellungen > Speicher > „Übertragung im WLAN starten“ kannst du den Bericht am Handy öffnen (Seite „Letzten Absturzbericht anzeigen“) und dort kopieren.¦Na telewizorze często nie można używać schowka: w Ustawieniach > Pamięć > „Rozpocznij przesyłanie przez Wi-Fi” możesz otworzyć raport na swoim telefonie (strona „Pokaż ostatni raport o awariach”) i tam go skopiować.
Auf dem Handy im Querformat¦Krajobraz na telefonach
Die App ist für den Fernseher gebaut und wirkt quer am besten. Aus: dreht mit dem Gerät. Im Player: Tippen zeigt die Steuerung, Doppeltippen links/rechts spult, in der Mitte Pause.¦Aplikacja jest przeznaczona dla telewizji i najlepiej wygląda w orientacji poziomej. Wył.: obraca się wraz z urządzeniem. W odtwarzaczu: dotknięcie pokazuje sterowanie, dwukrotne dotknięcie w lewo/prawo pomija, w środku pauzuje.
Oder mit der Handy-Kamera scannen¦Lub zeskanuj aparatem w telefonie
QR-Code scannen¦Zeskanuj kod QR
Unterstütze IPVIO Stream¦Wesprzyj IPVIO Stream
Raster & Ansicht¦Siatka i widok
American Football¦Futbol amerykański
Basketball¦Koszykówka
Eishockey¦Hokej na lodzie
Fußball¦Piłka nożna (piłka nożna)
Tennis¦Tenis
Motorsport¦Sporty motorowe
Kampfsport¦Sporty walki
Golf¦Golfa
Handball & Volleyball¦Piłka ręczna i siatkówka
Rugby & Cricket¦Rugby i krykiet
Radsport¦Jazda na rowerze
Wintersport¦Sporty zimowe
Darts & Snooker¦Rzutki i snooker
Nächste 3 Std.¦Następne 3 godziny
Morgen¦Jutro
Keine Sendungen für diese Auswahl¦Brak programów dla tego wyboru
Zusatzbild¦Dodatkowe zdjęcie
Anordnung¦Układ
Bild-in-Bild¦Obraz w obrazie
Geteilt¦Podzielony ekran
Ton von¦Dźwięk z
Hauptstream¦Główny strumień
Streams tauschen¦Zamień strumienie
Dieser Sender ist beim Anbieter gerade nicht erreichbar. Probiere einen anderen.¦Ten kanał jest obecnie niedostępny u operatora. Spróbuj innego.
Dein Anbieter erlaubt vermutlich nur eine Verbindung gleichzeitig. Frage nach einem Zugang mit mehr Verbindungen.¦Twój dostawca prawdopodobnie zezwala tylko na jedno połączenie na raz. Poproś o login z większą liczbą połączeń.
Die Verbindung ist zu langsam oder wurde abgelehnt. Ein Sender in niedrigerer Qualität hilft oft.¦Połączenie jest zbyt wolne lub zostało odrzucone. Często pomaga kanał o niższej jakości.
Dein Gerät schafft zwei Videos gleichzeitig nicht. Wähle für beide Bilder SD-Sender.¦Twoje urządzenie nie może obsłużyć dwóch filmów jednocześnie. Wybierz kanały SD dla obu zdjęć.
Probiere einen anderen Sender oder eine niedrigere Qualität.¦Spróbuj innego kanału lub niższej jakości.
Schon ein anderes Gerät mit IPVIO Stream? Spiele die Sicherung ein: Playlists, Zugangsdaten, Verlauf, Favoriten und Einstellungen sind danach sofort da.¦Masz już inne urządzenie ze strumieniem IPVIO? Przywróć kopię zapasową: listy odtwarzania, dane logowania, historia, ulubione i ustawienia są dostępne od razu.
Sicherung von anderem Gerät einspielen¦Przywróć kopię zapasową z innego urządzenia
Auf diesem Gerät gibt es keine Dateiauswahl. Spiele die Sicherung über die Handy-Seite rechts ein.¦To urządzenie nie ma selektora plików. Przywróć kopię zapasową za pomocą strony telefonu po prawej stronie.
Sicherung mit Playlists speichern …¦Zapisz kopię zapasową z listami odtwarzania…
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze die Übertragung im WLAN.¦To urządzenie nie ma selektora plików. Skorzystaj z transferu Wi-Fi.
Gesichert werden Einstellungen, Favoriten, Verlauf, Weiterschauen und Profile. Playlists und Zugangsdaten sind nur in „Sicherung mit Playlists“ enthalten (die Datei enthält Passwörter, gib sie nicht weiter). Beim Wiederherstellen startet die App neu. Auf einem neuen Gerät geht das gleich beim Hinzufügen der ersten Playlist.¦Ustawienia, ulubione, historia, kontynuuj oglądanie i kopie zapasowe profili. Listy odtwarzania i loginy znajdują się tylko w „Zapisz kopię zapasową z listami odtwarzania” (plik zawiera hasła, nie udostępniaj ich). Aplikacja uruchamia się ponownie po przywróceniu. Na nowym urządzeniu możesz to zrobić już podczas dodawania pierwszej playlisty.
Wichtig zu wissen¦Dobrze wiedzieć
IPVIO Stream ist nur ein Abspielgerät. Die App liefert selbst keine Sender, Filme, Serien und keine Playlist. Den Link oder die Zugangsdaten bekommst du von deinem IPTV-Anbieter oder aus deiner eigenen Quelle. Wir können dir keinen Link nennen.¦IPVIO Stream to tylko odtwarzacz. Sama aplikacja nie udostępnia żadnych kanałów, filmów, seriali ani playlist. Link lub login otrzymasz od swojego dostawcy IPTV lub z własnego źródła. Nie możemy podać linku.
OK = groß¦OK = powiększ
Handy und dieses Gerät müssen im selben WLAN sein. Halte die Kamera auf das Bild. Es klappt auch aus einiger Entfernung.¦Telefon i to urządzenie muszą znajdować się w tej samej sieci Wi-Fi. Trzymaj aparat przy zdjęciu. Działa również z pewnej odległości.
Oder Adresse im Browser eintippen:¦Lub wpisz adres w przeglądarce:
Zurück oder OK schließt das Bild.¦Wstecz lub OK zamyka obraz.
Leiste nach unten¦Pasek w dół
Leiste nach oben¦Bar do góry
Texte¦Etykiety
Immer zeigen¦Zawsze pokazuj
Nur Symbole¦Tylko ikony
Beim Markieren¦Po podświetleniu
Bild¦Obraz
Kartenbreite¦Szerokość karty
Spalten und Zeilen gelten nur in der Ansicht „Raster“.¦Kolumny i wiersze mają zastosowanie tylko w widoku „Siatka”.
Zeigt die echte App mit deinen Titeln; die Einstellungen erscheinen in einer schmalen Leiste unten. Ein Klick auf eine Auswahl wirkt sofort.¦Pokazuje prawdziwą aplikację z Twoimi tytułami; ustawienia pojawiają się na wąskim pasku na dole. Jedno kliknięcie opcji powoduje jej natychmiastowe zastosowanie.
Zwei gleich groß¦Dwie równe płytki
Einer groß, einer klein¦Jeden duży, jeden mały
So sieht eine Karte aus: normal und markiert¦Wygląd karty: normalny i podświetlony
Score-Overlay¦Nakładka z wynikami
Anzeige¦Wyświetlacz
Untereinander¦Ułożone
Nebeneinander¦Obok siebie
In den Ecken verteilt¦Rozłóż na rogach
Ausgewählte Spiele entfernen¦Usuń wybrane gry
Zusatzbild nicht abspielbar¦Nie można odtworzyć dodatkowego obrazu
Alle Playlists¦Wszystkie listy odtwarzania
Fenstergröße¦Rozmiar okna
Gilt für Bild-in-Bild. Deine Auswahl wird gespeichert.¦Dotyczy obrazu w obrazie. Twój wybór został zapisany.
Handy-Suche¦Wyszukiwanie przez telefon
Der Server konnte nicht gestartet werden.¦Nie można uruchomić serwera.
Suche und starte Filme, Serien und Sender am Handy. Handy und Fernseher müssen im selben WLAN sein.¦Wyszukuj i uruchamiaj filmy, seriale i kanały w swoim telefonie. Telefon i telewizor muszą być połączone z tą samą siecią Wi-Fi.
Filme, Serien, Sender suchen …¦Szukaj filmów, seriali, kanałów…
Pause / Weiter¦Pauza / odtwarzanie
Leiser¦Tom -
Lauter¦Tom +
Code vom Fernseher:¦Kod z telewizora:
Tippe einen Titel ein.¦Wpisz tytuł.
Läuft auf dem Fernseher.¦Gram na telewizorze.
Fehler. Ist der Fernseher noch an?¦Błąd. Czy telewizor jest nadal włączony?
Es läuft nichts.¦Nic nie jest odtwarzane.
"""

internal val DictPl5 = """
Die Playlist wird noch geladen.¦Lista odtwarzania wciąż się ładuje.
Nichts gefunden.¦Nic nie znaleziono.
Folge¦Odcinek
Lädt …¦Ładowanie…
Stopp¦Zatrzymaj
Beenden¦Zakończ
Fertige Designs¦Gotowe projekty
Ein Klick stellt Farbe und Hintergrund passend ein. Darunter kannst du alles weiter von Hand ändern.¦Jedno kliknięcie ustawia dopasowanie koloru i tła. Poniżej nadal możesz wszystko zmienić ręcznie.
Bildschirm anpassen¦Dostosuj ekran
Uhr anzeigen¦Pokaż zegar
Zeigt die Uhrzeit oben neben dem Profil-Symbol.¦Pokazuje godzinę u góry obok ikony profilu.
Rand links und rechts¦Margines lewy i prawy
Rand oben und unten¦Margines górny i dolny
Wenn am Fernseher Menü oder Texte am Rand abgeschnitten werden, stelle hier einen Rand ein. Der Hintergrund bleibt vollflächig, der Player nutzt immer den ganzen Bildschirm.¦Jeśli menu lub tekst są obcięte na krawędzi telewizora, ustaw tutaj margines. Tło pozostaje pełne ekranu, gracz zawsze korzysta z całego ekranu.
Leer¦Odstęp
Alles¦Wyczyść
Beendet¦Zakończono
Auf¦Włączone
Nicht in deinen Sendern¦Nie na Twoich kanałach
Kein Sender in deiner Liste gefunden¦Na Twojej liście nie znaleziono kanału
Live-Ergebnisse: An¦Wyniki na żywo: Włączone
Live-Ergebnisse: Aus¦Wyniki na żywo: wyłączone
Jetzt live auf deinen Sendern¦Na żywo teraz na swoich kanałach
Ergebnisse werden geladen …¦Ładowanie wyników…
Ergebnisse gerade nicht erreichbar – es werden nur Playlist und TV-Guide gezeigt.¦Wyniki są obecnie nieosiągalne – wyświetlana jest tylko lista odtwarzania i przewodnik telewizyjny.
Dokumentationen¦Filmy dokumentalne
Zuletzt gesehen¦Ostatnio oglądane Pozostało
noch¦pozostało
▲▼ Sender  ·  OK Steuerung  ·  OK halten: mehr¦▲▼ kanały · OK elementy sterujące · przytrzymaj OK, aby uzyskać więcej
Meine Teams¦Moje zespoły
Teams merken¦Zapisz zespoły
OK auf einem Team merkt es oder entfernt es wieder. Es erscheinen die Teams der Spiele des gewählten Tages.¦OK w zespole zapisuje lub usuwa. Wyświetlone zostaną drużyny z meczów wybranego dnia.
Hinweise: An¦Alerty: włączone
Hinweise: Aus¦Alerty: wyłączone
Verzögerung¦Opóźnienie
Dein Team spielt gleich¦Twoja drużyna wkrótce zagra
Dein Team spielt jetzt¦Twoja drużyna gra teraz
Punkte!¦Gol!
Mini-Spielstand¦Minitablica wyników
Ein kleines Fenster in der Ecke zeigt den Stand, solange eines deiner Teams spielt – auch beim Film oder auf einem anderen Sender.¦Małe okienko w rogu pokazuje wynik podczas gry jednej z twoich drużyn – nawet podczas filmu lub na innym kanale.
Fenster: An¦Okno: Włączone
Fenster: Aus¦Okno: wyłączone
Logos und Namen¦Loga i nazwy
Nur Logos¦Tylko logo
Spielzeit: An¦Czas gry: Włączony
Spielzeit: Aus¦Czas gry: wyłączony
Sender korrigieren¦Poprawny kanał
Zurücksetzen (automatisch)¦Resetuj (automatycznie)
Kein Sender gefunden. Lange drücken zum Korrigieren.¦Nie znaleziono kanału. Naciśnij długo, aby poprawić.
Tabelle¦Tabela
Keine Tabelle verfügbar.¦Brak dostępnych stolików.
Ausgeblendete¦Ukryty
Alle wieder einblenden¦Pokaż wszystko jeszcze raz
Kategorie ausblenden¦Ukryj kategorię
Gruppen ignorieren¦Ignoruj grupy
Alle wieder einschalten¦Włącz wszystko ponownie
Ignoriert¦Ignorowano
Titel und Sender sind nach der Kennung deines Anbieters gebündelt (z. B. „TR |“, „[EN]“, „AR:“). Schalte Bündel aus, die du nicht brauchst: Sie verschwinden sofort überall, ohne die Playlist neu zu laden. Ausgeschaltet heißt ignoriert. Hilft dort, wo der Sprachfilter eine Kennung nicht erkennt.¦Tytuły i kanały są grupowane według tagu Twojego dostawcy (np. „TR |”, „[EN]”, „AR:”). Wyłącz pakiety, których nie potrzebujesz: znikają wszędzie na raz, bez konieczności ponownego ładowania listy odtwarzania. Wyłączone oznacza ignorowanie. Pomaga, gdy filtr języka nie rozpoznaje tagu.
Kalender¦Kalendarz
Ligen¦Ligi
Abgewählte Ligen erscheinen nicht und werden nicht abgefragt.¦Odznaczone ligi nie są wyświetlane i nie są sprawdzane.
Live-Ergebnisse sind aus. Schalte sie oben ein, dann erscheint der Kalender.¦Wyniki na żywo są wyłączone. Włącz je powyżej, a pojawi się kalendarz.
Du hast noch keine Teams gemerkt. Unter „Meine Teams“ kannst du Teams merken.¦Nie zapisałeś jeszcze żadnych drużyn. Możesz zapisywać drużyny w zakładce „Moje zespoły”.
Kalender wird geladen …¦Ładowanie kalendarza…
In den nächsten 7 Tagen spielt keines deiner Teams.¦Żadna z Twoich drużyn nie zagra w ciągu najbliższych 7 dni.
Spiele deiner Teams in den nächsten 7 Tagen¦Mecze Twoich drużyn w ciągu najbliższych 7 dni
Sicherung speichern unter …¦Zapisz kopię zapasową jako…
Sicherung aus Datei laden …¦Załaduj kopię zapasową z pliku…
Sicherung gespeichert.¦Kopia zapasowa została zapisana.
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze „Sicherung erstellen“.¦To urządzenie nie ma selektora plików. Użyj opcji „Utwórz kopię zapasową”.
Auf diesem Gerät gibt es keine Dateiauswahl.¦To urządzenie nie ma selektora plików.
„Speichern unter“ lässt dich den Ort wählen, zum Beispiel Google Drive, Downloads oder einen USB-Stick – so nimmst du die Sicherung auf ein anderes Gerät mit.¦„Zapisz jako” pozwala wybrać lokalizację, na przykład Dysk Google, Pobrane pliki lub pamięć USB – dzięki czemu możesz przenieść kopię zapasową na inne urządzenie.
Rot¦Czerwony
Blau¦Niebieski
Dünn¦Cienki
Dick¦Gruby
Extra dick¦Bardzo gruby
Was möchtest du sehen?¦Co chcesz obejrzeć?
Die Inhalte werden geladen …¦Ładowanie treści…
Hier gibt es noch nichts zu sehen. Bitte lass den Bildschirm einrichten.¦Nie ma tu jeszcze nic do oglądania. Poproś kogoś o skonfigurowanie tego ekranu.
Zum Beenden weiter halten …¦Przytrzymaj, aby wyjść…
Boomer Mode beenden¦Wyjdź z trybu Boomer
Gib die PIN ein.¦Wprowadź PIN.
Dieser Sender ist gerade nicht verfügbar¦Ten kanał jest obecnie niedostępny
Du kommst gleich wieder zur Auswahl.¦Za chwilę wrócisz do selekcji.
So sieht es aus¦Tak to wygląda
Der Boomer Mode ist mit deiner Kindersicherungs-PIN geschützt.¦Tryb Boomer jest chroniony kodem PIN kontroli rodzicielskiej.
Für den Boomer Mode brauchst du eine 4-stellige PIN. Sie schützt auch die Kindersicherung.¦Tryb Boomer wymaga 4-cyfrowego PIN-u. Chroni także kontrolę rodzicielską.
Eine ganz einfache Oberfläche für Eltern und Großeltern: große Kacheln mit Bild, kein Menü, keine Suche, keine Einstellungen. Du stellst hier alles ein, die Person davor muss nur noch auswählen.¦Bardzo prosty ekran dla rodziców i dziadków: duże kafelki ze zdjęciami, bez menu, bez wyszukiwania, bez ustawień. Tutaj wszystko ustawiasz, osoba przed telewizorem musi tylko wybrać.
Boomer Mode jetzt starten¦Uruchom teraz tryb Boomer
Die App wechselt sofort zur einfachen Oberfläche. Stelle vorher alles ein. Zurück zur normalen App: Zurück-Taste 10 Sekunden halten, dann PIN.¦Aplikacja natychmiast przełącza się na prosty ekran. Najpierw skonfiguruj wszystko. Powrót do normalnej aplikacji: przytrzymaj przycisk Wstecz przez 10 sekund, a następnie wprowadź kod PIN.
Automatischer Start nach dem Einschalten: bereit¦Automatyczny start po włączeniu zasilania: gotowy
Automatischer Start: Berechtigung „Über anderen Apps einblenden“ fehlt¦Automatyczny start: brak pozwolenia „Wyświetlanie nad innymi aplikacjami”.
Im Boomer Mode öffnet sich IPVIO Stream von selbst, sobald der Fernseher oder die Box eingeschaltet wird. Manche Geräte (z. B. einzelne Fire-TV-Modelle) blockieren das trotzdem.¦W trybie Boomer strumień IPVIO otwiera się sam, gdy tylko telewizor lub urządzenie zostanie włączone. Niektóre urządzenia (np. niektóre modele Fire TV) i tak to blokują.
Was der Bildschirm zeigt¦Co pokazuje ekran
Schalte Reihen ein oder aus und schiebe sie mit „Hoch“ und „Runter“. Reihen ohne Inhalt bleiben automatisch versteckt.¦Włącz lub wyłącz rzędy i przesuwaj je za pomocą „W górę” i „W dół”. Wiersze bez treści pozostają automatycznie ukryte.
Sender auswählen¦Wybierz kanały
Wähle aus deiner ganzen Senderliste mit Logos die Sender, die in der Reihe „Meine Sender“ erscheinen. Ohne Auswahl zeigt der Modus deine Live-Favoriten.¦Wybierz kanały z całej listy kanałów, z logo. Pojawiają się w wierszu „Moje kanały”. Bez wyboru tryb pokazuje ulubione na żywo.
Sender auswählen …¦Wybierz kanały…
Auswahl löschen¦Wyczyść zaznaczenie
Filme und Serien auswählen¦Wybierz filmy i seriale
Wähle Filme und Serien aus, die in der Reihe „Meine Filme und Serien“ erscheinen. Ein Film startet sofort, bei einer Serie öffnet sich die Folgenliste.¦Wybierz filmy i seriale w wierszu „Moje filmy i seriale”. Film zaczyna się natychmiast; w przypadku serialu otwiera się lista odcinków.
Filme und Serien auswählen …¦Wybierz filmy i seriale…
Ausgewählt¦Wybrano
Aussehen¦Wygląd
Größe der Kacheln¦Rozmiar płytki
Größe der Schrift¦Rozmiar tekstu
Markierung: Farbe des Rahmens¦Podświetlenie: kolor obramowania
Markierung: Dicke des Rahmens¦Wyróżnienie: grubość obramowania
Zusätzliche helle Innenlinie¦Bardzo lekka linia wewnętrzna
Macht die Markierung noch deutlicher, auch bei Farbschwäche.¦Sprawia, że podświetlenie jest jeszcze wyraźniejsze, także w przypadku ślepoty barw.
Die markierte Kachel wird leicht größer. Ausschalten = alles bleibt ruhig.¦Podświetlona płytka nieznacznie się powiększa. Wył. = wszystko pozostaje spokojne.
Logos und Bilder zeigen¦Pokaż logo i zdjęcia
Aus = nur der Name in großer Schrift.¦Wył. = tylko nazwa pisana dużym tekstem.
So kommst du wieder heraus¦Jak znowu się wydostać
Zurück-Taste 10 Sekunden gedrückt halten, dann die PIN eingeben. Am Handy: die Überschrift „Was möchtest du sehen?“ lange berühren.¦Przytrzymaj przycisk Wstecz przez 10 sekund, następnie wprowadź PIN. Na telefonie: naciśnij i przytrzymaj nagłówek „Co chcesz obejrzeć?”.
Gerade automatisch: deine Live-Favoriten. Sobald du eine Kachel unten mit OK wählst oder Sender auswählst, stellst du die Reihe selbst zusammen.¦Obecnie automatyczne: Twoje ulubione na żywo. Gdy tylko wybierzesz poniższy kafelek za pomocą OK lub wybierzesz kanały, sam zbudujesz rząd.
Du hast die Sender selbst zusammengestellt. OK auf einer Kachel: nach links oder rechts schieben, oder entfernen.¦Kanały składasz sam. OK na kafelku: przesuń go w lewo lub w prawo albo usuń.
Aus Favoriten übernehmen¦Przejmij od ulubionych
Zuletzt gesehene dazu¦Dodaj ostatnio oglądane
Aus Senderliste …¦Z listy kanałów…
Noch keine Sender. Wähle oben Sender aus oder markiere sie in Live TV mit dem Stern.¦Nie ma jeszcze kanałów. Wybierz kanały powyżej lub oznacz je gwiazdką w Live TV.
Nach links schieben¦Przejdź w lewo
Nach rechts schieben¦Przejdź w prawo
OK wählt aus oder nimmt wieder heraus¦OK zaznacza lub usuwa
Ausgewählte¦Wybrane pozycje
Noch nichts ausgewählt.¦Nic jeszcze nie zostało wybrane.
Hier gibt es nichts.¦Tu nic nie ma.
Große Slideshow¦Duży pokaz slajdów
Großes Bild oben mit aktuellen Filmen und Serien¦Duże zdjęcie u góry z aktualnymi filmami i serialami
Live TV, Filme, Serien, Favoriten und Meine Liste¦Telewizja na żywo, filmy, seriale, ulubione i moja lista
Uhr und Datum¦Zegar i data
Große Uhr mit dem heutigen Datum¦Duży zegar z dzisiejszą datą
Dort weitermachen, wo du aufgehört hast¦Kontynuuj od miejsca, w którym skończyłeś
Meine Sender¦Moje kanały
Deine Live-Favoriten als Reihe¦Twoje ulubione na żywo z rzędu
Live TV gerade¦Telewizja na żywo już teraz
Was jetzt auf deinen Sendern läuft¦Co jest obecnie na Twoich kanałach
Die beliebtesten Titel des Tages¦Najpopularniejsze obecnie tytuły
Weil du etwas geschaut hast¦Ponieważ coś oglądałeś
Ähnliche Titel zu deinem letzten Film oder deiner letzten Serie¦Tytuły podobne do Twojego ostatniego filmu lub serialu
Titel, die du dir gemerkt hast¦Tytuły, które zapisałeś
Alles, was du zuletzt gestartet hast¦Wszystko, co ostatnio zacząłeś
Neue Filme¦Nowe filmy
Zuletzt hinzugefügte Filme¦Ostatnio dodane filmy
Beste Filme¦Najlepsze filmy
Die am besten bewerteten Filme¦Najlepiej oceniane filmy
Neue Serien¦Nowa seria
Zuletzt hinzugefügte Serien¦Ostatnio dodane serie
Beste Serien¦Najlepsza seria
Die am besten bewerteten Serien¦Najlepiej oceniana seria
Serien nach Genre¦Seria według gatunku
Reihen für die häufigsten Serien-Genres¦Wiersze dotyczące najpopularniejszych gatunków seriali
Filme nach Genre¦Filmy według gatunku
Reihen für die häufigsten Film-Genres¦Wiersze z najpopularniejszymi gatunkami filmowymi
Große Uhr¦Duży zegar
Uhrzeit und Datum, gut lesbar¦Godzina i data, łatwe do odczytania
Die Sender, die du ausgewählt hast (sonst die Live-Favoriten)¦Wybrane kanały (w przeciwnym razie ulubione kanały na żywo)
Filme und Serien dort fortsetzen, wo es aufgehört hat¦Kontynuuj filmy i seriale tam, gdzie się zatrzymały
Meine Filme und Serien¦Moje filmy i seriale
Die Filme und Serien, die du ausgewählt hast¦Wybrane filmy i seriale
Titel aus der Merkliste¦Tytuły z listy obserwowanych
Was zuletzt gestartet wurde¦Co się ostatnio zaczęło
Gezeigt¦Pokazano
Versteckt¦Ukryty
Hoch¦W górę
Runter¦W dół
Auf Standard zurücksetzen¦Przywróć domyślne
Baue dir deine Startseite: Schalte Reihen und Widgets ein oder aus und schiebe sie mit „Hoch“ und „Runter“ an die Stelle, die du möchtest. Die Änderung gilt sofort, schau danach auf der Startseite nach.¦Zbuduj swój ekran główny: włączaj i wyłączaj wiersze i widżety oraz przesuwaj je za pomocą „W górę” i „W dół” tam, gdzie chcesz. Zmiany obowiązują natychmiast. Sprawdź później ekran główny.
Startseite anpassen¦Dostosuj dom
Reihen und Widgets wählen und ordnen¦Wybierz i rozmieść wiersze oraz widżety
Ganz einfach: große Kacheln zum Auswählen¦Super proste: duże płytki do wyboru
Spende¦Przekaż darowiznę
Hallo, ich bin der nigerianische Prinz und brauche dringend deine Hilfe! Spaß beiseite: Die App kostet dich nichts, mich aber ein paar Nächte Schlaf und sehr viel Kaffee. Wenn du mir ein paar Euro schicken möchtest, tanzt mein Kontostand vor Freude. Kein Zwang: Die App bleibt kostenlos, werbefrei und GPL-lizenziert.¦Witam, jestem nigeryjskim księciem i pilnie potrzebuję Twojej pomocy! Żarty na bok: aplikacja nic Cię nie kosztuje, mnie natomiast kosztowało kilka nocy przespanych i mnóstwo kawy. Jeśli chcesz mi przesłać kilka euro, moje konto bankowe zatańczy z radości. Bez presji: aplikacja pozostaje bezpłatna, wolna od reklam i dostępna na licencji GPL.
Mit der Handy-Kamera scannen¦Zeskanuj aparatem w telefonie
Folgen werden geladen …¦Ładowanie odcinków…
Die Folgen konnten nicht geladen werden. Verbindung oder Zugang prüfen.¦Nie można załadować odcinków. Sprawdź swoje połączenie lub konto.
Dieser QR-Code ist der PayPal-Link für meine Spende. Mit der Handy-Kamera scannen, dann öffnet sich PayPal.¦Ten kod QR to łącze PayPal do mojej darowizny. Zeskanuj go aparatem w telefonie, a PayPal się otworzy.
Übersicht¦Przegląd
Spielplan¦Harmonogram
Teams¦Zespoły
Top-Spiel¦Najlepsze dopasowanie
Demnächst¦Wkrótce
Beliebte Ligen¦Popularne ligi
Sportarten¦Sport
Verschoben¦Przełożone
Abgesagt¦Anulowano
Statistik¦Statystyki
Aufstellung¦Składy
Ereignisse¦Wydarzenia
Kommentar¦Komentarz
Bank¦Ławka
Tore¦Cele
Zuschauer¦Obecność
Sender starten¦Uruchom kanał
▶ Auf deinen Sendern¦▶ Na Twoich kanałach
Lade Spiele …¦Ładowanie gier…
Heute keine Spiele gefunden.¦Dzisiaj nie znaleziono żadnych gier.
Keine Spiele für diese Auswahl.¦Brak gier dla tej selekcji.
Dieser Bereich folgt im nächsten Schritt.¦Ta sekcja znajduje się w następnym kroku.
Lade Details …¦Trwa ładowanie szczegółów…
Keine Details verfügbar.¦Brak dostępnych szczegółów.
Keine Liga aktiv.¦Żadna liga nie jest aktywna.
Lade Tabelle …¦Tabela ładowania…
Für diese Liga gibt es keine Tabelle.¦Dla tej ligi nie ma tabeli.
Lade Teams …¦Ładowanie drużyn…
Keine Teams gefunden.¦Nie znaleziono żadnych drużyn.
Nächste Spiele¦Następne mecze
Letzte Spiele¦Ostatnie gry
Nächstes Spiel¦Następna gra
Letztes Spiel¦Ostatni mecz
Kader¦Skład
Trainer¦Trener
Spiele¦Gry
Team merken¦Zapisz drużynę
Nicht mehr merken¦Usuń z zapisanych
Meine Ligen¦Moje ligi
Meine Sportarten¦Moje sporty
Heute für dich¦Dziś dla Was
Heute keine Spiele deiner Favoriten.¦Dziś nie ma gier z Twoich ulubionych.
Noch keine Teams gemerkt. Im Team Center gibt es „Team merken“.¦Nie zapisano jeszcze żadnych drużyn. Użyj opcji „Zapisz zespół” w Centrum zespołu.
Design und Farbe¦Projekt i kolor
Berechtigung erteilt. Der Autostart ist bereit.¦Pozwolenie udzielone. Autostart jest gotowy.
Berechtigung fehlt noch. Bitte „Einstellung öffnen“ wählen und IPVIO Stream erlauben.¦Nadal brakuje pozwolenia. Wybierz „Otwórz ustawienie” i zezwól na transmisję IPVIO.
Hauptliste¦lista główna Pokazano również
zusätzlich angezeigt¦także widoczna
Nicht mehr zusätzlich anzeigen¦Przestań też wyświetlać
Zusätzlich anzeigen¦Pokaż też
Zur Hauptliste machen¦Utwórz listę główną
Die Hauptliste ist die Playlist, mit der die App arbeitet. „Zusätzlich anzeigen“ blendet eine weitere Playlist dazu ein; sie ersetzt die Hauptliste nicht.¦Lista główna to playlista, z którą współpracuje aplikacja. „Pokaż także” dodaje kolejną listę odtwarzania na górze; nie zastępuje listy głównej.
Sender suchen¦Wyszukaj kanały
Sendername eingeben¦Wprowadź nazwę kanału
OK auf dem Feld öffnet die Tastatur. Gesucht wird im Sendernamen und in der Kategorie.¦OK w polu otwiera klawiaturę. Wyszukiwanie obejmuje nazwy i kategorie kanałów.
Im TV-Guide suchen¦Przeszukaj przewodnik telewizyjny
Sender oder Sendung¦Kanał lub program
Handy¦Telefon
Zuletzt gesucht (OK lange gedrückt = Eintrag entfernen)¦Ostatnie wyszukiwania (przytrzymaj OK = usuń wpis)
Zuletzt gesucht¦Ostatnie wyszukiwania
Suche nach einem Titel: hier erscheinen Beschreibung, Bewertung und Format des markierten Treffers.¦Wyszukaj tytuł: tutaj pojawi się opis, ocena i format wyróżnionego hitu.
SportsHub¦Centrum sportowe
Sports Hub öffnen¦Otwarte centrum sportowe
Sender-Qualitäten bündeln¦Pakiet cech kanałów
Derselbe Sender in 8K, 4K, FHD, HD und SD erscheint als eine Zeile. OK startet die beste Qualität, die anderen wählst du im Menü des Senders (OK gedrückt halten).¦Ten sam kanał w rozdzielczości 8K, 4K, FHD, HD i SD pojawia się w jednym rzędzie. OK rozpoczyna najlepszą jakość; wybierz pozostałe w menu kanału (przytrzymaj OK).
Rand: „Schatten“ legt einen weichen dunklen Schatten unter die Schrift, „Kontur“ zeichnet einen schwarzen Rand rundherum (besser lesbar auf hellem Bild), „Kein“ lässt die Schrift pur.¦Krawędź: „Cień” umieszcza pod tekstem miękki, ciemny cień, „Kontur” rysuje dookoła czarną obwódkę (bardziej czytelną na jasnych obrazach), „Brak” utrzymuje tekst prosty.
Bildschirmrand einstellen¦Dostosuj krawędź ekranu
Zeigt einen Rahmen mit vier Ecken am Fernseher: Stelle den Rand ein, bis alle vier Ecken sichtbar sind. Hilft, wenn dein Fernseher Menü oder Texte am Rand abschneidet.¦Wyświetla na telewizorze klatkę z czterema rogami: dostosuj margines, aż wszystkie cztery rogi będą widoczne. Pomaga, jeśli telewizor obcina menu lub tekst na krawędzi.
Du siehst einen weißen Rahmen mit vier grünen Punkten. Wenn eine Ecke fehlt, schneidet dein Fernseher den Rand ab. Rechts/Links ändert den Rand seitlich, Hoch/Runter oben und unten, bis alle vier Ecken sichtbar sind. OK speichert.¦Widzisz białą ramkę z czterema zielonymi kropkami. Jeśli brakuje narożnika, telewizor obcina krawędź. Prawo/Lewo zmienia margines boczny, Góra/Dół góra i dół, aż wszystkie cztery rogi będą widoczne. OK, oszczędza.
Seitlich¦Boki
Oben/unten¦Góra/dół
Karten: So sehen einzelne Filme und Serien in den Listen aus (Poster oder breites Bild, Größe, Infos).¦Karty: jak pojedyncze filmy i seriale wyglądają na listach (plakat lub obraz panoramiczny, rozmiar, informacje).
Seitenleiste: Das Menü am Rand mit Startseite, Filme, Serien und Live TV. Du kannst sie links, rechts oder oben anzeigen.¦Pasek boczny: menu na krawędzi z Strona główna, Filmy, Seriale i Telewizja na żywo. Możesz pokazać go po lewej, prawej stronie lub na górze.
Raster & Ansicht: Wie viele Titel nebeneinander erscheinen und ob Details zum markierten Titel gezeigt werden.¦Siatka i widok: ile tytułów pojawia się obok siebie i czy pokazane są szczegóły wybranego tytułu.
Startseite: Aussehen der ersten Seite nach dem Start. Welche Reihen erscheinen, stellst du über „Startseite anpassen“ ein.¦Strona główna: wygląd pierwszej strony po uruchomieniu. To, które wiersze się pojawią, ustawia się w „Dostosuj stronę główną”.
Kategorien: Die Ordner deines Anbieters oder automatische Genres und ihre Darstellung.¦Kategorie: foldery lub automatyczne gatunki Twojego dostawcy oraz sposób ich wyświetlania.
Wiedergabe¦Odtwarzanie
Intro und nächste Folge¦Intro i kolejny odcinek
Uhr im Bild¦Zegar na ekranie
Netzwerk und Bildrate¦Sieć i liczba klatek na sekundę
Liste importiert¦Lista zaimportowana
Titel gelesen¦tytuły przeczytane
in deiner Playlist gefunden¦znaleziony na Twojej liście odtwarzania
Mehrfachansicht¦Wiele widoków
Vier gleich groß¦Cztery równe płytki
Einer groß, drei klein¦Jeden duży, trzy małe
OK = Ton hierher, OK lange = Sender wechseln¦OK = dźwięk tutaj, długo OK = zmień kanał
So sieht die Reihenfolge aus¦Oto wynikowa kolejność
Nichts gezeigt¦Nic nie pokazano
Listen importieren¦Importuj listy
Letterboxd, MyAnimeList, Trakt¦Letterboxd, MyAnimeList, Trakt
Hole deine Listen von Letterboxd, MyAnimeList oder Trakt in die App. Die Titel werden mit deiner Playlist abgeglichen: Merkliste und Gesehen werden übernommen.¦Przenieś swoje listy z Letterboxd, MyAnimeList lub Trakt do aplikacji. Tytuły są dopasowywane do Twojej listy odtwarzania: lista obserwowanych i obejrzane zostały zaimportowane.
Letterboxd: ZIP oder CSV · MyAnimeList: XML · Trakt: JSON¦Letterboxd: ZIP lub CSV · MyAnimeList: XML · Trakt: JSON
Dieses Gerät hat keinen sicheren Schlüsselspeicher: Playlist-Adressen mit Zugangsdaten werden unverschlüsselt gespeichert.¦To urządzenie nie ma bezpiecznego magazynu kluczy: adresy list odtwarzania z danymi logowania są przechowywane w postaci niezaszyfrowanej.
Datei vom Gerät wählen¦Wybierz plik z urządzenia
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze den Import im WLAN.¦To urządzenie nie ma selektora plików. Użyj importu Wi-Fi.
Import im WLAN starten¦Rozpocznij import przez Wi-Fi
Import beenden¦Zatrzymaj import
Am Handy „Liste importieren“ wählen, den Code eingeben und die Exportdatei hochladen.¦Na telefonie wybierz „Importuj listę”, wpisz kod i prześlij plik eksportu.
Direkt auf der Startseite bearbeiten¦Edytuj bezpośrednio na ekranie głównym
Öffnet die echte Startseite mit deinen Titeln. Über jeder Reihe erscheint eine Leiste zum Verschieben und Ein- oder Ausblenden.¦Otwiera prawdziwy ekran główny z Twoimi tytułami. Pasek nad każdym wierszem pozwala go przenieść lub pokazać/ukryć.
Oder hier in der Liste: Schalte Reihen und Widgets ein oder aus und schiebe sie mit „Hoch“ und „Runter“ an die Stelle, die du möchtest. Die Änderung gilt sofort.¦Lub tutaj na liście: włącz lub wyłącz wiersze i widżety i przesuń je za pomocą „W górę” i „W dół” tam, gdzie chcesz. Zmiana obowiązuje natychmiast.
Immer oben¦Zawsze na topie
Einblenden¦Pokaż
Bearbeiten: Über jeder Reihe kannst du sie verschieben oder ausblenden.¦Edycja: nad każdym wierszem możesz go przenieść lub ukryć.
Auf der echten Startseite ansehen¦Zobacz to na prawdziwym ekranie głównym
Live-Vorschau¦Podgląd na żywo
Eine Auswahl wirkt sofort, ohne OK.¦Wybór zaczyna obowiązywać natychmiast, nie jest potrzebne żadne OK.
Weiter nach unten wechselt den Bereich, die App dahinter springt mit.¦Przejście dalej w dół przełącza obszar, a aplikacja podąża za nim.
Raster: Wie viele Spalten und Zeilen die Rasteransicht (zum Beispiel „Alle Filme“) zeigt.¦Siatka: ile kolumn i wierszy pokazuje widok siatki (na przykład „Wszystkie filmy”).
Score-Overlay: An¦Nakładka wyniku: włączona
Score-Overlay: Aus¦Nakładka wyniku: wyłączona
"""

internal val DictPl6 = """
Setzt Ansicht, Menü, Player, Ton und Start auf die Standardwerte. Playlists, Favoriten und Verlauf bleiben erhalten. Das Design hat einen eigenen Knopf.¦Resetuje widok, menu, odtwarzacz, dźwięk i start do ustawień domyślnych. Listy odtwarzania, ulubione i historia zostaną zachowane. Projekt ma swój własny przycisk.
Live-Vorschau starten¦Rozpocznij podgląd na żywo
Zeigt die echte App mit deinen Titeln; unten erscheinen die Einstellungen. Jede Auswahl wirkt sofort, ohne OK.¦Pokazuje prawdziwą aplikację z Twoimi tytułami; ustawienia pojawiają się na dole. Każdy wybór ma skutek natychmiastowy, nie jest potrzebne żadne OK.
Letterboxd · Gesehen¦Letterboxd · Oglądane
Letterboxd · Merkliste¦Letterboxd · Lista obserwowanych
Trakt · Gesehen¦Trakt · Obejrzałem
Trakt · Merkliste¦Trakt · Lista obserwowanych
MyAnimeList · Gesehen¦MyAnimeList · Obejrzane
MyAnimeList · Merkliste¦MyAnimeList · Lista obserwowanych
1 Spiel¦1 gra
{#0} Spiele¦{#0} gier
Spiel¦Gra
Formel 1¦Formuła 1
1. Training¦Praktyka 1
2. Training¦Ćwicz 2
3. Training¦Ćwicz 3
Qualifying¦Kwalifikacje
Sprint-Qualifying¦Kwalifikacje do sprintu
Sprint¦Sprint
Rennen¦Wyścig
Aktuelle Position¦Aktualna pozycja
Alle Ligen¦Wszystkie ligi
Alle Wettbewerbe¦Wszystkie zawody
Als Favorit merken¦Dodaj do ulubionych
Anderen Sender wählen¦Wybierz inny kanał
Sender zuordnen¦Przypisz kanał
Automatisch zuordnen¦Przypisz automatycznie
Auf deinen Sendern¦Na Waszych kanałach
Live ansehen¦Oglądaj na żywo
Kein passender Sender gefunden¦Nie znaleziono pasującego kanału
ESPN liefert keine Streams. Gesucht wird in deinem TV-Guide und in deinen Sendernamen. Du kannst den Sender auch selbst zuordnen; die App merkt sich das für dieses Spiel.¦ESPN nie zapewnia transmisji. Aplikacja przeszukuje Twój przewodnik telewizyjny i nazwy kanałów. Możesz także samodzielnie przypisać kanał; aplikacja zapamiętuje to dla tej gry.
Von dir zugeordnet¦Przypisane przez Ciebie
Laut TV-Guide¦Według przewodnika telewizyjnego
Sendername passt¦Nazwa kanału pasuje
Verfügbar¦Dostępne
Keine Sender in der Playlist.¦Brak kanałów na liście odtwarzania.
Match Center¦Centrum meczowe
Daten konnten nicht geladen werden¦Nie można załadować danych
Die Daten konnten nicht geladen werden. Bitte versuche es erneut.¦Nie można załadować danych. Spróbuj ponownie.
ESPN antwortet gerade nicht. Bitte versuche es erneut.¦ESPN w tej chwili nie odpowiada. Spróbuj ponownie.
ESPN antwortet gerade nicht. Prüfe die Internetverbindung und versuche es erneut.¦ESPN w tej chwili nie odpowiada. Sprawdź połączenie internetowe i spróbuj ponownie.
ESPN hat für dieses Team gerade keine Daten geliefert.¦ESPN nie dostarczył obecnie żadnych danych dla tego zespołu.
ESPN liefert für diesen Spieler keine Daten.¦ESPN nie dostarcza żadnych danych dla tego gracza.
Keine Spielerdaten¦Brak danych gracza
Ergebnisse von heute¦Dzisiejsze wyniki
Ergebnisse¦Wyniki
Letzte Ergebnisse¦Najnowsze wyniki
Keine Ergebnisse¦Brak wyników
Noch keine Ergebnisse¦Brak jeszcze wyników
Live-Ergebnisse sind aus¦Wyniki na żywo są wyłączone
Ergebnisse, Tabellen und Spielpläne kommen von ESPN (inoffizielle Quelle). Schalte sie ein, um den Sports Hub zu nutzen.¦Wyniki, tabele i harmonogramy pochodzą z ESPN (źródło nieoficjalne). Włącz je, aby korzystać z centrum sportowego.
Einschalten¦Włącz
Gerade läuft nichts¦W tej chwili nic nie jest na żywo
Sobald ein Spiel deiner Ligen beginnt, erscheint es hier.¦Gdy tylko rozpocznie się gra w Twoich ligach, pojawi się ona tutaj.
Ändere die Filter oder schau in den Spielplan.¦Zmień filtry lub spójrz na harmonogram.
Spielplan öffnen¦Harmonogram otwarty
In deinen Ligen ist heute nichts angesetzt. Im Spielplan siehst du die nächsten Tage.¦Na dziś nie zaplanowano spotkań w Twoich ligach. Sprawdź terminarz na kolejne dni.
An diesem Tag ist in deinen Ligen nichts angesetzt. Tennis, Formel 1, UFC, Golf und Cricket zeigt ESPN nur für die laufenden Turniere und Wochenenden.¦W tym dniu nie zaplanowano spotkań w Twoich ligach. ESPN pokazuje tenis, Formułę 1, UFC, golf i krykiet tylko podczas bieżących turniejów i weekendów.
Hinweis: Die letzte Aktualisierung hat nicht geklappt. Angezeigt wird der letzte Stand.¦Uwaga: ostatnia aktualizacja nie powiodła się. Wyświetlany jest ostatni znany stan.
In den nächsten Tagen keine Spiele deiner Favoriten.¦W najbliższych dniach nie będzie żadnych gier z Twoich ulubionych.
Kein Spiel geplant¦Nie zaplanowano żadnego meczu
Keine Spiele geplant¦Brak zaplanowanych meczów
Heute keine Spiele.¦Dziś nie ma żadnych meczów.
Gerade keine Ereignisse.¦Obecnie brak wydarzeń.
In diesem Zeitraum liefert ESPN keine Spiele.¦ESPN nie dostarcza żadnych meczów w tym okresie.
Ligen schaltest du im Reiter „Sender“ unter „Ligen“ ein.¦Ligi włączasz w zakładce „Kanały” w zakładce „Ligi”.
Lade Daten …¦Ładowanie danych…
Meine Favoriten¦Moje ulubione
Merke dir Teams, Wettbewerbe, Spieler oder Sportarten. Sie erscheinen hier mit ihren Spielen.¦Zapisuj drużyny, zawody, zawodników lub sport. Pojawiają się tutaj ze swoimi grami.
Sport entdecken¦Odkryj sport
Nur Favoriten¦Tylko ulubione
OK auf eine Sportart merkt sie oder entfernt sie wieder.¦OK w sporcie zapisuje go lub usuwa ponownie.
Wichtige Ereignisse¦Kluczowe wydarzenia
Spielbericht¦Raport z meczu
Direktvergleich¦Bezpośrednio
Form¦Formularz
Klassement¦Tabele
Kampfabend¦Karta walki
Spieler¦Zawodnicy
Startelf¦Pierwszy skład
Ersatzbank¦Rezerwowi
eingewechselt¦wszedł na boisko
ausgewechselt¦zszedł z boiska
Satz¦Set
Sätze¦Sety
Spitze¦Liderzy
Torjäger¦Najlepsi strzelcy
Topspieler¦Najlepsi gracze
Wettbewerbe¦Zawody
Aktuell¦Aktualne
Geboren¦Urodzony
Gewicht¦Waga
Nation¦Narodowość
Nummer¦Numer
Team¦Zespół
Beginn: {0}¦Początek: {0}
{0} führt {1} gegen {2}.¦{0} prowadzi {1} przeciwko {2}.
{0} gewinnt {1} gegen {2}.¦{0} wygrywa {1} z {2}.
Es steht {0} zwischen {1} und {2}.¦Jest {0} pomiędzy {1} a {2}.
{0} und {1} trennen sich {2}.¦{0} i {1} losuj {2}.
Pkt¦Pkt
Sp¦s
S¦W
U¦D
N¦L
TD¦GD
OTN¦OTL
Serie¦Seria
J.¦lat
Am Handy eingeben¦Wejdź na telefon
Schlüssel vom Handy erhalten und gespeichert. Jetzt „Speichern und prüfen“ drücken.¦Klucz otrzymany z Twojego telefonu i zapisany. Teraz naciśnij „Zapisz i sprawdź”.
Eingabe am Handy beenden¦Zatrzymaj wprowadzanie sygnału telefonicznego
Untertitel online suchen¦Szukaj napisów online
Kostenlos unter subdl.com > Konto > API. Im Player unter „Audio & Untertitel“ > „Untertitel online suchen“ werden beide Dienste gefragt.¦Bezpłatnie na subdl.com > Konto > API. W odtwarzaczu „Dźwięk i napisy” > „Wyszukaj napisy online” pytają obie usługi.
Keine Untertitel in den gewünschten Sprachen¦Brak napisów w żądanych językach
Kein Schlüssel für die Untertitel-Suche. Einstellungen > API-Schlüssel¦Brak klucza do wyszukiwania napisów. Ustawienia > Klucze API
Weiter ohne Playlist¦Kontynuuj bez listy odtwarzania
MAC-Adresse¦Adres MAC
Seriennummer (optional)¦Numer seryjny (opcjonalnie)
Device ID (optional)¦Identyfikator urządzenia (opcjonalnie)
Device ID 2 (optional)¦Identyfikator urządzenia 2 (opcjonalnie)
Seriennummer und Device IDs nur eintragen, wenn dein Anbieter sie verlangt (wie bei TiviMate oder STB Emu). Leer = die App erzeugt eigene Werte.¦Numer seryjny i identyfikator urządzenia wprowadzaj tylko wtedy, gdy wymaga tego Twój dostawca (jak w przypadku TiviMate lub STB Emu). Pusty = aplikacja generuje własne wartości.
Update verfügbar¦Dostępna aktualizacja
Neue Version {0} (installiert: {1})¦Nowa wersja {0} (zainstalowana: {1})
Deine Playlists und Einstellungen bleiben erhalten. Android fragt vor der Installation einmal nach.¦Twoje listy odtwarzania i ustawienia zostaną zachowane. Android pyta raz przed instalacją.
Jetzt aktualisieren¦Zaktualizuj teraz
Später¦Później
Auf Updates prüfen¦Sprawdź aktualizacje
Suche nach Updates …¦Sprawdzam dostępność aktualizacji…
Du hast die neueste Version ({0}).¦Masz najnowszą wersję ({0}).
Update anzeigen¦Pokaż aktualizację
Keine Verbindung. Prüfe das Netzwerk und versuche es erneut.¦Brak połączenia. Sprawdź sieć i spróbuj ponownie.
Dieser Hinweis erscheint nur einmal.¦To powiadomienie pojawia się tylko raz.
Staffel gesehen¦Sezon obejrzany
Staffel zurücksetzen¦Wyczyść oznaczenia sezonu
Serie gesehen¦Serial obejrzany
Serie zurücksetzen¦Wyczyść oznaczenia serialu
Als gesehen markieren¦Oznacz jako obejrzane
Als ungesehen markieren¦Oznacz jako nieobejrzane
Aus „Zuletzt geschaut“ entfernen¦Usuń z „Ostatnio oglądanych”
OK lange drücken = als gesehen markieren¦Przytrzymaj OK = zaznacz jako obejrzane
OK lange drücken = als ungesehen markieren¦Przytrzymaj OK = zaznacz jako nieobejrzany
Tastatur des Geräts in der Suche¦Wyszukiwana klawiatura urządzenia
Aus: die eingebaute Tastatur der App. An: die Tastatur deines Geräts (z. B. Gboard) mit allen Sprachen, Sprachfunktion und Einfügen. Mit OK auf das Suchfeld wird sie geöffnet.¦Wyłączona: wbudowana klawiatura aplikacji. Włączone: klawiatura Twojego urządzenia (np. Gboard) ze wszystkimi językami, wprowadzaniem głosowym i wklejaniem. Naciśnij OK w polu wyszukiwania, aby je otworzyć.
Nach oben verschieben¦Przesuń w górę
Nach unten verschieben¦Przesuń w dół
An den Anfang verschieben¦Przenieś na początek
Kategorien sortieren …¦Sortuj kategorie…
Anbieter-Reihenfolge¦Zamówienie dostawcy
Eigene Reihenfolge¦Zamówienie własne
Prüfsumme stimmt nicht. Die Datei ist beschädigt oder verändert. Versuche es erneut.¦Niezgodność sumy kontrolnej. Plik jest uszkodzony lub został zmieniony. Spróbuj ponownie.
Download unvollständig. Versuche es erneut.¦Pobieranie niekompletne. Spróbuj ponownie.
Die Datei ist keine gültige App-Datei.¦Plik nie jest prawidłowym plikiem aplikacji.
Die Datei gehört zu einer anderen App.¦Plik należy do innej aplikacji.
Die Datei ist nicht neuer als die installierte Version.¦Plik nie jest nowszy niż wersja zainstalowana.
Die Versionsnummer passt nicht zur Update-Datei.¦Numer wersji nie jest zgodny z plikiem aktualizacji.
Die Signatur passt nicht zur installierten App. Android würde das Update ablehnen. Erstelle ein Backup, installiere die App neu und stelle das Backup wieder her.¦Podpis nie pasuje do zainstalowanej aplikacji. Android odrzuciłby aktualizację. Utwórz kopię zapasową, zainstaluj ponownie aplikację i przywróć kopię zapasową.
Die Signatur konnte nicht geprüft werden.¦Nie można sprawdzić podpisu.
Update-Datei: ungültige Prüfsumme¦Plik aktualizacji: nieprawidłowa suma kontrolna
Update-Datei: Download-Adresse nicht sicher¦Plik aktualizacji: adres pobierania nie jest bezpieczny
Dieses Update ist erforderlich.¦Ta aktualizacja jest wymagana.
OpenSubtitles API-Schlüssel¦Klucz API OpenSubtitles
SubDL API-Schlüssel¦Klucz API SubDL
TMDB, IMDb, Rotten Tomatoes, Untertitel¦TMDB, IMDb, Rotten Tomatoes, napisy
Titel unbekannt¦Tytuł nieznany
Suche fehlgeschlagen¦Wyszukiwanie nie powiodło się
Download fehlgeschlagen¦Pobieranie nie powiodło się
Tageslimit erreicht¦Dzienny limit osiągnięty
Keine Untertitel gefunden¦Nie znaleziono napisów
Untertitel konnte nicht geladen werden¦Nie można załadować napisów
Untertitel geladen¦Załadowano napisy
Kostenlos unter opensubtitles.com: Konto anlegen, dann unter „API consumers“ eine App anlegen und den API-Schlüssel eintragen. Ohne Anmeldung sind nur wenige Downloads pro Tag möglich.¦Bezpłatnie na opensubtitles.com: utwórz konto, następnie utwórz aplikację w sekcji „Konsumenci API” i wprowadź jej klucz API. Bez logowania możliwe jest tylko kilka pobrań dziennie.
Diese Seite zurücksetzen¦Przywróć domyślne ustawienia tej strony
Diese Seite wurde zurückgesetzt.¦Ta strona została zresetowana.
Version, Quellen, Updates¦Wersja, źródła, aktualizacje
Alles zurücksetzen¦Przywróć wszystkie ustawienia
Alle Einstellungen auf Standard¦Wszystkie ustawienia wróciły do ustawień domyślnych
Alle Einstellungen zurücksetzen?¦Zresetować wszystkie ustawienia?
Kategorien suchen, z. B. EU | DE¦Kategorie wyszukiwania, np. UE | DE
Keine Kategorie gefunden.¦Nie znaleziono kategorii.
Alle Treffer aus¦Wszystkie wyniki wyłączone
Alle Treffer ein¦Wszystkie wyniki włączone
Gefundene Kategorien¦Znaleziono kategorie
Es werden nicht alle Treffer angezeigt. Grenze die Suche genauer ein – „Alle Treffer“ gilt trotzdem für alle.¦Nie wszystkie wyniki są pokazane. Zawęź wyszukiwanie – „Wszystkie wyniki” nadal dotyczą wszystkich.
Alle Einstellungen gehen auf die Standardwerte zurück. Playlists, Favoriten, Verlauf und Fortsetzen-Positionen bleiben erhalten. Das lässt sich nicht rückgängig machen.¦Wszystkie ustawienia wracają do wartości domyślnych. Listy odtwarzania, ulubione, historia i pozycje wznowienia są zachowywane. Tego nie można cofnąć.
Alle Einstellungen wurden zurückgesetzt.¦Wszystkie ustawienia zostały zresetowane.
Senderzeilen¦Rzędy kanałów
Gleicht Favoriten, Verlauf und Einstellungen zwischen deinen Geräten ab. Die App legt in deinem Google Drive den Ordner „IPVIO Stream Sync“ an und sieht nur diesen Ordner, sonst nichts.¦Synchronizuje ulubione, historię i ustawienia między urządzeniami. Aplikacja tworzy folder „IPVIO Stream Sync” na Twoim Dysku Google i widzi tylko ten folder i nic więcej.
Playlists und API-Schlüssel mitsichern¦Twórz także kopie zapasowe list odtwarzania i kluczy API
Verschlüsselt mit deinem Sync-Passwort. Ohne das Passwort kann niemand sie lesen, auch Google nicht.¦Zaszyfrowane przy użyciu hasła synchronizacji. Bez hasła nikt nie będzie mógł ich odczytać, nawet Google.
Sync-Passwort (mindestens 8 Zeichen)¦Hasło synchronizacji (co najmniej 8 znaków)
Auf allen Geräten das gleiche Passwort verwenden. Auf dem Fire TV kannst du auch mit der Fire-TV-App am Handy tippen. Vergisst du es, lassen sich die Playlists aus Drive nicht mehr lesen.¦Używaj tego samego hasła na wszystkich urządzeniach. W Fire TV możesz także pisać za pomocą aplikacji Fire TV na telefonie. Jeśli o tym zapomnisz, playlist na Dysku nie będzie można już odczytać.
Letzte Sicherung von diesem Gerät: {0}¦Ostatnia kopia zapasowa z tego urządzenia: {0}
Das Sync-Passwort braucht mindestens 8 Zeichen.¦Hasło synchronizacji musi mieć co najmniej 8 znaków.
In Google Drive gesichert.¦Kopia zapasowa została utworzona na Dysku Google.
Sicherungen in Drive anzeigen¦Pokaż kopie zapasowe na Dysku
In Google Drive gibt es noch keine Sicherung.¦Na Dysku Google nie ma jeszcze kopii zapasowej.
Von Google trennen¦Odłącz od Google
Getrennt. Die Sicherungen in Google Drive bleiben erhalten.¦Rozłączono. Kopie zapasowe na Dysku Google zostaną zachowane.
Mit Google verbunden.¦Połączono z Google.
Die Anmeldung wurde am Handy abgelehnt.¦Logowanie na telefonie zostało odrzucone.
Der Code ist abgelaufen. Bitte neu verbinden.¦Kod wygasł. Proszę połączyć się ponownie.
Die Anmeldung bei Google ist fehlgeschlagen.¦Logowanie do Google nie powiodło się.
Warte auf die Bestätigung am Handy …¦Czekam na potwierdzenie przez telefon…
Sicherung zum Wiederherstellen wählen:¦Wybierz kopię zapasową do przywrócenia:
Unbekanntes Gerät¦Nieznane urządzenie
Inhalt der Sicherung¦Kopia zapasowa zawartości
App-Version {0}¦Wersja aplikacji {0}
Profile: {#0}¦Profile: {#0}
Favoriten: {#0}¦Ulubione: {#0}
Enthält Playlists und API-Schlüssel (verschlüsselt).¦Zawiera listy odtwarzania i klucze API (zaszyfrowane).
Enthält Playlists.¦Zawiera listy odtwarzania.
Ohne Playlists.¦Bez list odtwarzania.
Favoriten und Listen¦Ulubione i listy
Verlauf und Weiterschauen¦Historia i oglądaj dalej
Einstellungen, Profile und Ausblendungen¦Ustawienia, profile i ukryte elementy
Playlists ergänzen¦Dodaj listy odtwarzania
Vorhandene Playlists bleiben. Fehlende API-Schlüssel werden eingetragen.¦Istniejące playlisty pozostają. Uzupełniono brakujące klucze API.
Die gewählten Bereiche werden auf diesem Gerät ersetzt. Vorher legt die App automatisch eine Sicherung an, die du mit „Letzte Wiederherstellung rückgängig“ zurückholen kannst. Die Jugendschutz-PIN bleibt auf diesem Gerät. Danach startet die App neu.¦Wybrane obszary zostaną zastąpione na tym urządzeniu. Wcześniej aplikacja automatycznie tworzy kopię zapasową, którą możesz przywrócić za pomocą opcji „Cofnij ostatnie przywracanie”. Kod PIN kontroli rodzicielskiej pozostaje na tym urządzeniu. Następnie aplikacja uruchamia się ponownie.
Wiederherstellen¦Przywróć
Wiederherstellen …¦Przywracanie…
Bitte mindestens einen Bereich wählen.¦Proszę wybrać przynajmniej jeden obszar.
Für die Playlists bitte oben das Sync-Passwort eingeben.¦Aby przywrócić listy odtwarzania, wprowadź hasło synchronizacji powyżej.
Falsches Sync-Passwort. Es wurde nichts geändert.¦Nieprawidłowe hasło synchronizacji. Nic nie zostało zmienione.
Die Sicherheitskopie ließ sich nicht anlegen. Es wurde nichts geändert.¦Nie można wykonać kopii bezpieczeństwa. Nic nie zostało zmienione.
Diese Sicherung ist ungültig.¦Ta kopia zapasowa jest nieprawidłowa.
Vor der letzten Wiederherstellung ({0}) hat die App automatisch eine Sicherung angelegt.¦Przed ostatnim przywróceniem ({0}) aplikacja automatycznie utworzyła kopię zapasową.
Letzte Wiederherstellung rückgängig¦Cofnij ostatnie przywracanie
Rückgängig machen ist fehlgeschlagen.¦Cofnięcie nie powiodło się.
Nicht mit Google verbunden. Bitte neu verbinden.¦Brak połączenia z Google. Proszę połączyć się ponownie.
Keine Verbindung zu Google. Bitte Internet prüfen.¦Brak połączenia z Google. Proszę sprawdzić internet.
Google Drive meldet einen Fehler ({#0}).¦Dysk Google zgłasza błąd ({#0}).
Google Drive meldet einen Fehler.¦Dysk Google zgłasza błąd.
Diese Sicherung gibt es in Google Drive nicht mehr.¦Ta kopia zapasowa nie istnieje już na Dysku Google.
Diese Sicherung ist zu groß.¦Ta kopia zapasowa jest za duża.
Unbekannter Fehler.¦Nieznany błąd.
Unbekannter Fehler: {0}¦Nieznany błąd: {0}
Die Anmeldung bei Google ist fehlgeschlagen: {0}¦Logowanie do Google nie powiodło się: {0}
Keine Verbindung zu Google ({0}). Bitte Internet prüfen.¦Brak połączenia z Google ({0}). Proszę sprawdzić internet.
Google Drive meldet einen Fehler ({#0}): {1}¦Dysk Google zgłasza błąd ({#0}): {1}
Google Drive meldet einen Fehler: {0}¦Dysk Google zgłasza błąd: {0}
Nachteule¦Nocna sowa
Vampir¦Wampir
Eisbär¦Niedźwiedź polarny
Tiefsee¦Głębokie morze
Waldschrat¦Las
Mitternachtssnack¦Przekąska o północy
Sonnenbrand¦Oparzenie słoneczne
Eisfach¦Zamrażarka
Waldboden¦Dno lasu
Glut¦Żar
Zuschneiden¦Przytnij
Live TV + Filme & Serien¦Telewizja na żywo + filmy i seriale
Nur Live TV¦Tylko telewizja na żywo
Nur Filme & Serien¦Tylko filmy i seriale
Es gibt keine {0}. Falls es welche geben sollte, prüfe Einstellungen > Playlists: Der Inhaltsmodus dieser Playlist steht vielleicht auf „{1}“.¦Nie ma {0}. Jeśli powinny być, sprawdź Ustawienia > Listy odtwarzania: tryb zawartości tej listy odtwarzania może być ustawiony na „{1}”.
Filme oder Serien¦filmy lub seriale
Kategorien ein- und ausblenden¦Pokaż i ukryj kategorie
Blende einzelne Kategorien aus oder schalte alle aus und nur die gewünschten wieder ein. Ausgeblendete Kategorien verschwinden sofort überall, ohne die Playlist neu zu laden.¦Ukryj pojedyncze kategorie lub wyłącz wszystkie i włącz tylko te, które chcesz. Ukryte kategorie znikają wszędzie od razu, bez konieczności ponownego ładowania listy odtwarzania.
Live-TV¦Telewizja na żywo
Zugangsdaten werden nur auf diesem Gerät gespeichert und hier nicht angezeigt. Es ist immer eine Playlist aktiv. Mit „Zur Hauptliste machen“ wechselst du die Liste.¦Dane logowania są przechowywane tylko na tym urządzeniu i nie są tutaj wyświetlane. Zawsze aktywna jest jedna playlista. Aby przełączać listy, użyj opcji „Utwórz listę główną”.
Tippe rechts mit der Tastatur. Gesucht wird im Sendernamen und in der Kategorie.¦Wpisz za pomocą klawiatury po prawej stronie. Wyszukiwanie obejmuje nazwy i kategorie kanałów.
Video¦Obraz
Ton¦Dźwięk
Video-Rate (laut Datei)¦Szybkość transmisji wideo (na plik)
Bilder: {#0} gezeigt · {#1} verworfen¦Klatki: Wyświetlono {#0} · Usunięto {#1}
übergangen: {0}¦pominięte: {0}
gemerkt: {0}¦zapisano: {0}
fertig: {0}¦ukończono: {0}
fertig: {0}  → als Nächstes {1}¦ukończono: {0} → dalej {1}
Fortsetzen #{0}: Eintrag {1} bei {#2}s → spielt {3}¦Wznów nr{0}: wpis {1} o {#2} s → odtwarza {3}
Fortsetzen #{0}: Eintrag {1} bei {#2}s → Folge nicht gefunden, gespeicherte Adresse¦Wznów #{0}: wpis {1} o {#2} s → nie znaleziono odcinka, zapisany adres
Fortsetzen #{0}: Eintrag {1} (nächste) bei {#2}s → spielt {3}¦Wznów #{0}: wpis {1} (następny) o {#2} s → odtwarza {3}
Fortsetzen #{0}: Eintrag {1} (nächste) bei {#2}s → Folge nicht gefunden, gespeicherte Adresse¦Wznów #{0}: wpis {1} (następny) o {#2} s → nie znaleziono odcinka, zapisany adres
Das Zertifikat des Anbieters passt nicht zur Server-Adresse. Beim Anbieter nach einer aktuellen Adresse fragen.¦Certyfikat dostawcy nie jest zgodny z adresem serwera. Zapytaj dostawcę o aktualny adres.
Der Server des Anbieters lehnt die Verbindung ab (512). Meist ist die Server-Adresse nicht mehr aktuell oder gesperrt.¦Serwer dostawcy odrzuca połączenie (512). Zwykle adres serwera jest nieaktualny lub zablokowany.
Der Server des Anbieters lehnt die Verbindung ab (512). Meist ist die Server-Adresse nicht mehr aktuell oder gesperrt. Beim Anbieter nach der aktuellen Adresse fragen.¦Serwer dostawcy odrzuca połączenie (512). Zwykle adres serwera jest nieaktualny lub zablokowany. Zapytaj dostawcę o aktualny adres.
Datei konnte nicht umbenannt werden¦Nie można zmienić nazwy pliku
Download unvollständig¦Pobieranie niekompletne
{0} (evtl. nicht abspielbar)¦{0} (może nie odtwarzać)
Setzt nur die Einstellungen dieser Seite auf die Standardwerte zurück. Alle anderen Seiten bleiben unverändert. Um alles auf einmal zurückzusetzen, nutze Einstellungen > Alles zurücksetzen.¦Resetuje tylko ustawienia tej strony do wartości domyślnych. Wszystkie pozostałe strony pozostają niezmienione. Aby zresetować wszystko na raz, użyj opcji Ustawienia > Resetuj wszystko.
Kleinere Zeilen zeigen mehr Sender auf einmal, das hilft auf großen Fernsehern. Größere Zeilen lassen sich aus der Ferne leichter lesen.¦Mniejsze rzędy pokazują więcej kanałów na raz, co jest przydatne w przypadku dużych telewizorów. Większe wiersze są łatwiejsze do odczytania z dużej odległości.
Setzt alle Einstellungen auf die Standardwerte zurück: Ansicht, Design, Menü, Player, Ton, Genres, Live TV und mehr. Playlists, Favoriten, Verlauf, Fortsetzen-Positionen und die PIN der Kindersicherung bleiben erhalten. Den Cache leerst du unter Speicher.¦Resetuje wszystkie ustawienia do wartości domyślnych: widok, wygląd, menu, odtwarzacz, dźwięk, gatunki, telewizja na żywo i inne. Listy odtwarzania, ulubione, historia, pozycje wznowienia i kod PIN kontroli rodzicielskiej zostaną zachowane. Wyczyść pamięć podręczną w obszarze Pamięć.
Nur eine Seite zurücksetzen? Jede Einstellungsseite hat unten ihren eigenen Zurücksetzen-Knopf.¦Zresetować tylko jedną stronę? Każda strona ustawień ma na dole własny przycisk resetowania.
Beim Markieren einer Auswahl zeigt die Vorschau sofort die Wirkung, OK übernimmt sie.¦Po podświetleniu opcji podgląd natychmiast pokazuje efekt, OK, stosuje go.
Filme und Serien direkt zu den Kategorien¦Filmy i seriale od razu w kategoriach
„Filme“ und „Serien“ im Menü öffnen sofort die Kategorien statt der Startseite des Bereichs. Zurück führt zur Startseite des Bereichs.¦Pozycje „Filmy” i „Seriale” otwierają od razu kategorie zamiast strony głównej danego działu. Przycisk Wstecz wraca na stronę główną działu.
Was ist neu¦Co nowego
Filme und Serien: auf Wunsch direkt zu den Kategorien (Einstellungen > Allgemein)¦Filmy i seriale: opcja otwierania bezpośrednio kategorii (Ustawienia > Ogólne)
Player: Untertitel- und Ton-Verzögerung im Menü einstellbar¦Odtwarzacz: regulacja opóźnienia napisów i dźwięku w menu
Player: das Menü schließt sich nur noch mit Zurück¦Odtwarzacz: menu zamyka się teraz tylko przyciskiem Wstecz
Live TV: OK gedrückt halten entfernt einen Sender aus „Zuletzt gesehen“¦Telewizja na żywo: przytrzymanie OK usuwa kanał z „Ostatnio oglądanych”
Jugendschutz: Inhalte für Erwachsene auf Wunsch nie auf den Startseiten¦Kontrola rodzicielska: możliwość całkowitego ukrycia treści dla dorosłych na stronach głównych
"""

internal val DictPl7 = """
Untertitel-Verzögerung¦Opóźnienie napisów
Ton-Verzögerung¦Opóźnienie dźwięku
Früher¦Wcześniej
Gilt nur für diesen Titel. Später = der Text erscheint später.¦Dotyczy tylko tego tytułu. Później = napisy pojawiają się później.
Später = der Ton kommt später als das Bild. Gilt für alle Titel auf diesem Gerät.¦Później = dźwięk jest opóźniony względem obrazu. Dotyczy wszystkich tytułów na tym urządzeniu.
Zurück schließt das Menü¦Wstecz zamyka menu
Aus „Zuletzt gesehen“ entfernt¦Usunięto z „Ostatnio oglądanych”
Erwachsenen-Inhalte nie auf den Startseiten¦Nigdy nie pokazuj treści dla dorosłych na stronach głównych
Zeigt Titel und Sender für Erwachsene nie in den Reihen der Startseiten (Start, Filme, Serien), auch nicht unter „Zuletzt geschaut“ oder „Weiter schauen“. In Live TV, in den Kategorien und in der Suche bleiben sie erreichbar.¦Ukrywa tytuły i kanały dla dorosłych na stronach głównych (Start, Filmy, Seriale), również w sekcjach „Ostatnio oglądane” i „Kontynuuj oglądanie”. Pozostają dostępne w telewizji na żywo, kategoriach i wyszukiwaniu.
Google Drive: Favoriten, Verlauf, Einstellungen und Playlists zwischen Geräten sichern und wiederherstellen (Einstellungen > Speicher)¦Dysk Google: twórz kopie zapasowe i przywracaj ulubione, historię, ustawienia i listy odtwarzania między urządzeniami (Ustawienia > Pamięć)
Live TV: Größe der Senderzeilen wählbar (Klein, Normal, Groß)¦Telewizja na żywo: wybierz rozmiar rzędów kanałów (mały, normalny, duży)
Filter: Kategorien suchen, Änderungen mit „Übernehmen“ auf einmal speichern¦Filtruj: kategorie wyszukiwania, zapisz wszystkie zmiany na raz za pomocą „Zastosuj”
API-Schlüssel bequem am Handy eingeben (QR-Code oben auf der Seite)¦Wprowadź wygodnie klucze API na swoim telefonie (kod QR na górze strony)
Die App startet schneller und ist kleiner¦Aplikacja uruchamia się szybciej i jest mniejsza
Nach jedem Update: dieses Fenster mit allen Neuigkeiten¦Po każdej aktualizacji: to okno ze wszystkimi nowościami
Kategorien abhaken ruckelt nicht mehr und bringt die App nicht mehr zum Absturz¦Zaznaczanie kategorii nie powoduje już zacinania się ani zawieszania aplikacji
24/7- und Adult-Kanäle erscheinen wieder, wenn der Filter aus ist¦Kanały 24/7 i kanały dla dorosłych pojawiają się ponownie po wyłączeniu filtra
Live TV: Genre-Kategorien lassen sich wieder per OK gedrückt halten ausblenden¦Telewizja na żywo: kategorie gatunków można ponownie ukryć, przytrzymując OK
Jugendschutz: die PIN lässt sich nur noch mit der PIN entfernen¦Kontrola rodzicielska: PIN można usunąć tylko za pomocą PIN-u
Suche am Handy: nur noch „Schließen“, Zurück schließt mit einem Druck¦Wyszukaj na swoim telefonie: pozostało tylko „Zamknij”, Wstecz zamyka jednym naciśnięciem
Startseite: der Playlist-Knopf zeigt „Playlist“ statt eines Download-Symbols, „Zusätzlich anzeigen“ entfernt¦Strona główna: na przycisku listy odtwarzania wyświetla się „Lista odtwarzania” zamiast ikony pobierania, usunięto opcję „Pokaż także”
Startseite: Reihenfolge und ausgeblendete Kategorien gelten auch für die Reihen¦Strona główna: kolejność kategorii i ukryte kategorie dotyczą również wierszy
Untertitel-Suche (SubDL) findet bei Serien wieder Treffer¦Wyszukiwanie napisów (SubDL) ponownie znajduje wyniki dla seriali
Bildformate heißen so, wie sie wirken („Zuschneiden“)¦Nazwy trybów proporcji zależą od ich funkcji („Przytnij”)
Viele fehlende Übersetzungen ergänzt¦Dodano wiele brakujących tłumaczeń
Hoch/Runter blättert¦Przewijanie w górę/w dół
"""
