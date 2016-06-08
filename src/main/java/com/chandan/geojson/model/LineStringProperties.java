package com.chandan.geojson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor(suppressConstructorProperties = true)
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonInclude(value = Include.NON_NULL)
public class LineStringProperties extends CommonProperties<LineString> {

	private long startNodeId;
	private long endNodeId;
	private String highway;
	private String building;

	// values can be coastline, tree_row
	private String natural;
}
