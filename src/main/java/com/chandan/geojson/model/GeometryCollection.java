package com.chandan.geojson.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Created by chandan on 2019-01-12.
 */
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GeometryCollection extends Geometry {

    private final List<Geometry> geometries;

    @JsonCreator
    public GeometryCollection(@JsonProperty("geometries") List<Geometry> geometries,
                              @JsonProperty("bbox") BoundingBox bbox) {
        super(bbox);
        this.geometries = geometries;
    }
}
