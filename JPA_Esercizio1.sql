CREATE TABLE clienti (
	numeroCliente SERIAL  PRIMARY KEY,
    nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	dataNascita DATE NOT NULL,
	regione VARCHAR NOT NULL
);

 CREATE TABLE fornitori (
     numeroFornitore SERIAL  PRIMARY KEY,
	 denominazione VARCHAR NOT NULL,
	 regione VARCHAR NOT NULL
 
 );
 
 CREATE TABLE IF NOT EXISTS fatture (
 numeroFattura SERIAL  PRIMARY KEY,
	 tipologia VARCHAR NOT NULL,
	 importo DECIMAL NOT NULL,
	 iva VARCHAR NOT NULL DEFAULT '20%',
	 idCliente INTEGER NOT NULL,
	 dataFattura DATE NOT NULL,
	 numeroFornitore INTEGER NOT NULL,
	 CONSTRAINT cliente_FK FOREIGN KEY(idCliente) REFERENCES clienti(numeroCliente),
	 CONSTRAINT fattura_FK FOREIGN KEY(numeroFornitore) REFERENCES fornitori(numeroFornitore)

 );
 
 CREATE TABLE IF NOT EXISTS prodotti(
	 idProdotto SERIAL PRIMARY KEY,
	 decrizione VARCHAR NOT NULL,
	 inProduzione BOOLEAN NOT NULL DEFAULT 'false',
	 inCommercio BOOLEAN  NOT NULL DEFAULT 'false',
	 dataAttivazione DATE NOT NULL,
	 dataDisattivazione DATE NOT NULL
	 
 )
 
INSERT INTO clienti(nome, cognome, dataNascita, regione)
    VALUES ('Mario', 'Verdi', '01/01/1999', 'Marche'),
           ('Maria', 'Gialli', '10/11/1989', 'Lazio'),
           ('Antonio', 'Nerii', '20/12/1982', 'Piemonte'),
           ('Pino', 'Viola', '30/03/1982', 'Abruzzo')
		  ('Pasquale', 'Blu', '30/03/1980', 'Abruzzo')

SELECT * FROM clienti
	
INSERT INTO fornitori (denominazione, regione)	
     VALUES ('Epicode', 'Lazio'),
	       ('Udemy', 'Liguria')
		   
SELECT * FROM fornitori
	
INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore)
   VALUES ('A', '200.50', '20%', 2, '20/02/2001', 1),
          ('B', '120.20', '10%', 5, '05/09/2010', 2),
          ('A', '99.10', '20%', 3, '26/10/2020', 1),
          ('C', '450.50', '10%', 5, '02/11/2010', 2)
		  
SELECT * FROM fatture
		 
INSERT INTO prodotti (decrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione)
   VALUES ('Prodotto a', true, false, '20/07/2020', '29/08/2040'),
          ('Prodotto b', true, false, '12/05/2017', '09/01/2041'),
	      ('Prodotto c', true, true, '26/09/2017', '05/08/2004')

SELECT * FROM prodotti
  
/*nome e cognome dei clienti nati nel 1982*/ 
SELECT nome, cognome FROM clienti WHERE EXTRACT (YEAR FROM dataNascita) =1982

/*numero fatture con iva al 20%*/	
SELECT COUNT(*) AS numeroFatture FROM fatture WHERE iva = '20%'

/*numero fatture e la somma dei relativi importi divisi per anno di fatturazione*/
/*devo raggruppare le fatture per anno di fatturazione*/
SELECT dataFattura FROM fatture
SELECT  COUNT(*) AS numeroFattura FROM fatture GROUP BY EXTRACT (YEAR FROM dataFattura);

SELECT 
EXTRACT (YEAR FROM dataFattura) AS anno, /*mi estrae anno e do alias anno*/
COUNT(*) AS numeroFattura,/*mi estrae il tot delle fatture*/
SUM(importo) /*somma gli importi*/
FROM fatture GROUP BY EXTRACT (YEAR FROM dataFattura);/*il tot e la somma sono raggruppati in base all'anno*/

SELECT SUM(importo) FROM fatture GROUP BY EXTRACT (YEAR FROM dataFattura);

/*prodotti attivati nel 2017 che sono in produzione oppure in commercio*/
SELECT * FROM prodotti
            WHERE EXTRACT (YEAR FROM dataAttivazione) =2017
			AND (inProduzione = true OR inCommercio = true)
			
/*considerando il numero di fatture al 20% estrarre numero di fatture per ogni anno*/
SELECT COUNT(*) AS iva FROM fatture WHERE iva = '20%'

SELECT 
EXTRACT (YEAR FROM dataFattura) AS anno,
COUNT(*) AS numeroFatture FROM fatture 
WHERE iva = '20%'
GROUP BY EXTRACT (YEAR FROM dataFattura)

/*estrarre anno in cui ci sono più di 2 fatture con tipologia A*/
SELECT 
EXTRACT (YEAR FROM dataFattura) AS anno , /*estraggo l'anno*/
COUNT(*) AS numeroFatture /*tot fatture*/
FROM fatture 
WHERE tipologia ='A' /*fatture di tipologia A*/
GROUP BY EXTRACT (YEAR FROM dataFattura) /*raggruppo fatture per anno*/
HAVING COUNT(*) >2

/*riportare elenco tutte fatture più in nome del fornitore*/
		  
SELECT numeroFattura, importo, iva, dataFattura, denominazione
FROM fatture LEFT JOIN fornitori ON fatture.numeroFornitore = fornitori.numeroFornitore


/*estrarre totale importi fatture divisi per residenza dei clienti*/
SELECT clienti.regione, 
COUNT(*) AS numeroFatture,
SUM(importo) 
FROM fatture 
INNER JOIN clienti ON fatture.idCliente = clienti.numeroCliente
GROUP BY clienti.regione

/*numero clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro*/
SELECT * FROM clienti LEFT JOIN fatture ON fatture.idCliente = clienti.numeroCliente
WHERE EXTRACT (YEAR FROM dataNascita) = 1980 AND fatture.importo > 50

/*estrarre una colonna di nome "Denominazione" contentente nome '-' cognome per i soli clienti residenti in ABRUZZO*/

SELECT CONCAT(nome, '-', cognome) AS Denominazione FROM clienti WHERE regione = 'Abruzzo'







