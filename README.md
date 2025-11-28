# Ceļojuma galamērķu JSON veidne

Šis ir neliels Java projekts, kas **izveido JSON failu** ar ceļojuma galamērķu veidni.

Palaidot programmu, tiek izveidots fails:

`celojumi_template.json`

## Kas ir šajā projektā?

Programma `main.java` izmanto bibliotēku **json-simple**, lai izveidotu JSON objektu ar vienu parauga ceļojuma galamērķi.

Katram ceļojuma galamērķim ir šādi lauki:

- `nosaukums` – pilsētas nosaukums (piem., `"Barselona"`)
- `valsts` – valsts (piem., `"Spānija"`)
- `ilgums` – ceļojuma ilgums dienās (piem., `5`)
- `budzets` – budžets EUR (piem., `600`)
- `aktivitates` – aktivitāšu saraksts (piem., `["muzejs", "pludmale"]`)


- [ ] Noņemt esošu galamērķi
- [ ] Meklēt galamērķi pēc: valsts vai konkrētas aktivitātes
- [ ]Atlasīt galamērķus pēc: budžeta robežas (piem., < 500) vai ceļošanas ilguma
- [ ]Aprēķināt statistiku: kopējais galamērķu skaits, vidējais ceļošanas ilgums, sastopamā aktivitāte
- [ ] Ievadīt datus (piedomāt pie ievades datu pārbaudēm)
- [ ] Izvēlēties darbību no izvēlnes
- [ ] Redzēt rezultātus skaidrā formā



Piemēra struktūra:

```json
{
  "celojumi": [
    {
      "nosaukums": "PIEMĒRS - Barselona",
      "valsts": "PIEMĒRS - Spānija",
      "ilgums": 5,
      "budzets": 600,
      "aktivitates": ["muzejs", "pludmale"]
    }
  ]
}
