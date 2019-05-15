package com.ha.crud.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * This is the entity, mapping sensor data to human_activity table in db. 
 * This will contain a create date and values or either accelerometer or gyroscope at a time.
 * @author charuag3
 *
 */
@Entity
@Table(name = "human_activity", schema="activity-db")
public class SensorData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
	private Long id;
	
	@Column(name="create_time")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	
	@Column(name="xcoor")
	private Double xCoor;
	@Column(name="ycoor")
	private Double yCoor;
	@Column(name="zcoor")
	private Double zCoor;
	@Column(name="xaxis")
	private Double xAxis;
	@Column(name="yaxis")
	private Double yAxis;
	@Column(name="zaxis")
	private Double zAxis;
	
	
	
	public SensorData() {
		this.xCoor=0d;
		this.yCoor=0d;
		this.zCoor=0d;
		this.xAxis=0d;
		this.yAxis=0d;
		this.zAxis=0d;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Double getxCoor() {
		return xCoor;
	}
	public void setxCoor(Double xCoor) {
		this.xCoor = xCoor;
	}
	public Double getyCoor() {
		return yCoor;
	}
	public void setyCoor(Double yCoor) {
		this.yCoor = yCoor;
	}
	public Double getzCoor() {
		return zCoor;
	}
	public void setzCoor(Double zCoor) {
		this.zCoor = zCoor;
	}
	public Double getxAxis() {
		return xAxis;
	}
	public void setxAxis(Double xAxis) {
		this.xAxis = xAxis;
	}
	public Double getyAxis() {
		return yAxis;
	}
	public void setyAxis(Double yAxis) {
		this.yAxis = yAxis;
	}
	public Double getzAxis() {
		return zAxis;
	}
	public void setzAxis(Double zAxis) {
		this.zAxis = zAxis;
	}
	@Override
	public String toString() {
		return "SensorData [id=" + id + ", createTime=" + createTime + ", xCoor=" + xCoor + ", yCoor=" + yCoor
				+ ", zCoor=" + zCoor + ", xAxis=" + xAxis + ", yAxis=" + yAxis + ", zAxis=" + zAxis + "]";
	}
}
