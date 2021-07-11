package com.company.kassa.web.screens.travel;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Travel;

@UiController("kassa_Travel.browse")
@UiDescriptor("travel-browse.xml")
@LookupComponent("travelsTable")
@LoadDataBeforeShow
public class TravelBrowse extends StandardLookup<Travel> {
}