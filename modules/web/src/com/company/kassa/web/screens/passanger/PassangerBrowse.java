package com.company.kassa.web.screens.passanger;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Passanger;

@UiController("kassa_Passanger.browse")
@UiDescriptor("passanger-browse.xml")
@LookupComponent("passangersTable")
@LoadDataBeforeShow
public class PassangerBrowse extends StandardLookup<Passanger> {
}