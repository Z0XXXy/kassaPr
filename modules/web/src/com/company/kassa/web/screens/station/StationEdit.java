package com.company.kassa.web.screens.station;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Station;

@UiController("kassa_Stations.edit")
@UiDescriptor("station-edit.xml")
@EditedEntityContainer("stationDc")
@LoadDataBeforeShow
public class StationEdit extends StandardEditor<Station> {
}