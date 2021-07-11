package com.company.kassa.web.screens.station;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Station;

@UiController("kassa_Stations.browse")
@UiDescriptor("station-browse.xml")
@LookupComponent("stationsTable")
@LoadDataBeforeShow
public class StationBrowse extends StandardLookup<Station> {
}