package com.company.kassa.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Ticket;

@UiController("kassa_Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
@LoadDataBeforeShow
public class TicketBrowse extends StandardLookup<Ticket> {
}