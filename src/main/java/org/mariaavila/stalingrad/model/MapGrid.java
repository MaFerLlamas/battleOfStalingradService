package org.mariaavila.stalingrad.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

/**
 * @author Maria Avila
 * MapGrid The Object and its validations
 * Id is autogenerated by the DB
 */
public class MapGrid   {

  @Id
  private String id;

  @NotNull
  @NotEmpty
  @NotBlank
  private String name;

  @Min(50)
  @Max(50)
  private Integer width;

  @Min(50)
  @Max(50)
  private Integer height;

  @NotNull
  @Min(0)
  @Max(9999)
  private List<Integer> obstacles = null;

  public MapGrid name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get Id
   * The Id in The DB
   * @return id
  */
   public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
  /**
   * Get name
   * @return name
  */

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MapGrid width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * minimum: 50
   * maximum: 100
   * @return width
  */

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public MapGrid height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * minimum: 50
   * maximum: 100
   * @return height
  */

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public MapGrid obstacles(List<Integer> obstacles) {
    this.obstacles = obstacles;
    return this;
  }

  public MapGrid addObstaclesItem(Integer obstaclesItem) {
    if (this.obstacles == null) {
      this.obstacles = new ArrayList<>();
    }
    this.obstacles.add(obstaclesItem);
    return this;
  }

  /**
   * Position of the obstacle inside the map, the beginning is 0, if the position doesn't exist the obstacle will be ignored. map positions example = [ 0 1 2 ] [ 3 4 5 ] [ 6 7 8 ] obstacles in [0, 1, 4, 9] gives results in [ x x   ] [   x   ] [       ] 
   * @return obstacles
  */

  public List<Integer> getObstacles() {
    return obstacles;
  }

  public void setObstacles(List<Integer> obstacles) {
    this.obstacles = obstacles;
  }

}

