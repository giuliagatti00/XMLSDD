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

        XMLNode nodeOrg = initgPty.append("Id")
                .append("OrgId");

        XMLNode nodeOthr1 = nodeOrg.append("Othr");

        nodeOthr1.append("Id").value({CodiceUnicoCBI}) //[max35Text]

        nodeOthr1.append("Issr").value("CBI"); //[max35Text]

        XMLNode nodeOthr2 = nodeOrg.append("Othr");

        nodeOthr2.append("Id").value({CodiceFiscaleEnte}) //[max35Text]

        nodeOthr2.append("Issr").value("ADE") //[max35Text]

        Blocco GrpHdr*/
    }
}
