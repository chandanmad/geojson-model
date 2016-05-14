package com.chandan.geojson.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor(suppressConstructorProperties = true)
@Getter
@EqualsAndHashCode
@ToString
public abstract class Geometry {
	
	private GeoJsonModelType type;
}
