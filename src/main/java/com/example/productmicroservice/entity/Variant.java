package com.example.productmicroservice.entity;

public class Variant {
    private String variantId;
    private String RAM;
    private String colour;
    private String screenSize;
    private String screenType;
    private String simSlots;
    private String batterySize;
    private String processor;
    private String frontCamera;
    private String backCamera;
    private int price;
    private String graphicsCard;
    private String usbPorts;
    private String networkDetails;
    private String speakerDetails;
    private String warrantyDetails;

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getSimSlots() {
        return simSlots;
    }

    public void setSimSlots(String simSlots) {
        this.simSlots = simSlots;
    }

    public String getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(String batterySize) {
        this.batterySize = batterySize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(String usbPorts) {
        this.usbPorts = usbPorts;
    }

    public String getNetworkDetails() {
        return networkDetails;
    }

    public void setNetworkDetails(String networkDetails) {
        this.networkDetails = networkDetails;
    }

    public String getSpeakerDetails() {
        return speakerDetails;
    }

    public void setSpeakerDetails(String speakerDetails) {
        this.speakerDetails = speakerDetails;
    }

    public String getWarrantyDetails() {
        return warrantyDetails;
    }

    public void setWarrantyDetails(String warrantyDetails) {
        this.warrantyDetails = warrantyDetails;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "variantId='" + variantId + '\'' +
                ", RAM='" + RAM + '\'' +
                ", colour='" + colour + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", screenType='" + screenType + '\'' +
                ", simSlots='" + simSlots + '\'' +
                ", batterySize='" + batterySize + '\'' +
                ", processor='" + processor + '\'' +
                ", frontCamera='" + frontCamera + '\'' +
                ", backCamera='" + backCamera + '\'' +
                ", price=" + price +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", usbPorts='" + usbPorts + '\'' +
                ", networkDetails='" + networkDetails + '\'' +
                ", speakerDetails='" + speakerDetails + '\'' +
                ", warrantyDetails='" + warrantyDetails + '\'' +
                '}';
    }
}
