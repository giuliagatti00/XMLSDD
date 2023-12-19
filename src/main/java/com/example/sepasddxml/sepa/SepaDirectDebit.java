package com.example.sepasddxml.sepa;

import com.example.sepasddxml.xml.XMLNode;

public class SepaDirectDebit {

    protected XMLNode document;
    //TODO eventuali attributi della classe

    public SepaDirectDebit(){
        //TODO prendere dto con i dati di cui si ha bisogno in input
    }

    //costruisce un messaggio logico di richiesta incasso SDD
    public void build(){
        this.document = new XMLNode().append("CBISDDReqLogMsg")
                .attr("xmlns:xs", "http://www.w3.org/2001/XMLSchema-instance")
                .attr("xmlns", "urn:CBI:xsd:CBISDDReqLogMsg.00.01.00")
                .attr("targetNamespace", "urn:CBI:xsd:CBISDDReqLogMsg.00.01.00")
                .attr("elementFormDefault", "qualified");
        XMLNode nodeGrpHdr = this.document.append("GrpHdr");

        /*Blocco GrpHdr

        //Identificativo del messaggio logico. Deve essere univoco a parità di azienda mittente e data di creazione
        nodeGrpHdr.append("MsgId").value({idMessaggio}); //[max35Text]

        //Data e ora di creazione del messaggio logico
        nodeGrpHdr.append("CreDtTm").value({dataOraCreazione}); //[ISODateTime]

        //Numero di transazioni DD incluse nel messaggio logico
        nodeGrpHdr.append("NbOfTxs").value({numeroTransazioniIncluse}); //[Max15NumericText]

        //Somma di controllo. Deve coincidere con la somma degli importi delle disposizioni di incasso contenute nella richiesta
        nodeGrpHdr.append("CtrlSum").value({sommaImportiTransazioni}); //[DecimalNumber]

        XMLNode initgPty = nodeGrpHdr.append("InitgPty");

        //Mittente della richiesta di incasso
        initgPty.append("Nm").value({nomeMittente}); //[max70Text]

        XMLNode nodeOthr = initgPty.append("Id")
                .append("OrgId")
                .append("Othr");

        nodeOthr.append("Id").value({CodiceUnicoCBI}) //[max35Text]

        /Codice identificativo fiscale univoco gestito dal Mittente/Ordinante a livello di blocco
        //Payment Information (potenzialmente multiplo), denominato Payment Information Identification, il quale
        //può abilitare (se gestito dal Mittente/Ordinante) la riconciliazione di singoli blocchi di richieste di incasso
        //omogenei per Creditore, data scadenza e conto di accredito (viene difatti parimenti restituito negli esiti a
        //livello di stato avanzamento 8). Dovrebbe essere "CBI"
        nodeOthr.append("Issr").value({identificativo}); //[max35Text]

        Blocco GrpHdr*/
    }
}
