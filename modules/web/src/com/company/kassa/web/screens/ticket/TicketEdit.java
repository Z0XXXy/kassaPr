package com.company.kassa.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Ticket;

@UiController("kassa_Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
@LoadDataBeforeShow
public class TicketEdit extends StandardEditor<Ticket> {
}