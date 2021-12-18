package com.androidtutorialpoint.googlemapsnearbyplaces;

import java.io.Serializable;
import java.util.List;

public class DirectionModel implements Serializable {
    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJu2_X1hPlDDkRSvSt_qcPsv8","types":["street_address"]},{"geocoder_status":"OK","place_id":"ChIJl9lfbTjlDDkRUV4et6-XQbo","types":["street_address"]}]
     * routes : [{"bounds":{"northeast":{"lat":28.6235305,"lng":77.3551031},"southwest":{"lat":28.604571,"lng":77.3499964}},"copyrights":"Map data ©2018 Google","legs":[{"distance":{"text":"2.5 km","value":2459},"duration":{"text":"7 mins","value":414},"end_address":"126, Noida-Khoda Rd, Makanpur Colony, Sector 62, Noida, Uttar Pradesh 201309, India","end_location":{"lat":28.6235305,"lng":77.3551031},"start_address":"C-1/68, Block B, Sector 55, Noida, Uttar Pradesh 201301, India","start_location":{"lat":28.604571,"lng":77.3501758},"steps":[{"distance":{"text":"0.1 km","value":97},"duration":{"text":"1 min","value":32},"end_location":{"lat":28.6054193,"lng":77.3500774},"html_instructions":"Head <b>north<\/b>","polyline":{"points":"qyqmDsmbwMAAAA?AC?A?m@Do@Hw@FI@"},"start_location":{"lat":28.604571,"lng":77.3501758},"travel_mode":"DRIVING"},{"distance":{"text":"49 m","value":49},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.6054896,"lng":77.350573},"html_instructions":"Turn <b>right<\/b> toward <b>Kamal Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{~qmD_mbwMMaB"},"start_location":{"lat":28.6054193,"lng":77.3500774},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":340},"duration":{"text":"1 min","value":55},"end_location":{"lat":28.6085146,"lng":77.3500901},"html_instructions":"Turn <b>left<\/b> onto <b>Kamal Marg<\/b>","maneuver":"turn-left","polyline":{"points":"i_rmDapbwMaGh@yIt@"},"start_location":{"lat":28.6054896,"lng":77.350573},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":520},"duration":{"text":"2 mins","value":107},"end_location":{"lat":28.610521,"lng":77.3542903},"html_instructions":"Continue straight<div style=\"font-size:0.9em\">Pass by Punjab National Bank ATM (on the left in 400&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"errmDambwMsANQ@CUWcE[kEASE]CIGMEM[i@c@{@CEGMy@yAg@cAk@cA"},"start_location":{"lat":28.6085146,"lng":77.3500901},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1453},"duration":{"text":"3 mins","value":207},"end_location":{"lat":28.6235305,"lng":77.3551031},"html_instructions":"Turn <b>left<\/b> at <b>Labour Chowk<\/b><div style=\"font-size:0.9em\">Pass by Central Power Research Institute (on the left in 1.2&nbsp;km)<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"w~rmDigcwMO?[Ac@EOA_H_AEAoBYoASaACU?a@AeCE[?wECwBAiHEW?yPIgB?qB?aHE"},"start_location":{"lat":28.610521,"lng":77.3542903},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"qyqmDsmbwMGE_BNaAHMaBaGh@mLdAQ@CUs@oKGq@m@oAiBiDsAgCk@AyIiA_Em@wAC{KKs^QyE?aHE"},"summary":"Kamal Marg","warnings":[],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean implements Serializable{
        /**
         * geocoder_status : OK
         * place_id : ChIJu2_X1hPlDDkRSvSt_qcPsv8
         * types : ["street_address"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean implements Serializable{
        /**
         * bounds : {"northeast":{"lat":28.6235305,"lng":77.3551031},"southwest":{"lat":28.604571,"lng":77.3499964}}
         * copyrights : Map data ©2018 Google
         * legs : [{"distance":{"text":"2.5 km","value":2459},"duration":{"text":"7 mins","value":414},"end_address":"126, Noida-Khoda Rd, Makanpur Colony, Sector 62, Noida, Uttar Pradesh 201309, India","end_location":{"lat":28.6235305,"lng":77.3551031},"start_address":"C-1/68, Block B, Sector 55, Noida, Uttar Pradesh 201301, India","start_location":{"lat":28.604571,"lng":77.3501758},"steps":[{"distance":{"text":"0.1 km","value":97},"duration":{"text":"1 min","value":32},"end_location":{"lat":28.6054193,"lng":77.3500774},"html_instructions":"Head <b>north<\/b>","polyline":{"points":"qyqmDsmbwMAAAA?AC?A?m@Do@Hw@FI@"},"start_location":{"lat":28.604571,"lng":77.3501758},"travel_mode":"DRIVING"},{"distance":{"text":"49 m","value":49},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.6054896,"lng":77.350573},"html_instructions":"Turn <b>right<\/b> toward <b>Kamal Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{~qmD_mbwMMaB"},"start_location":{"lat":28.6054193,"lng":77.3500774},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":340},"duration":{"text":"1 min","value":55},"end_location":{"lat":28.6085146,"lng":77.3500901},"html_instructions":"Turn <b>left<\/b> onto <b>Kamal Marg<\/b>","maneuver":"turn-left","polyline":{"points":"i_rmDapbwMaGh@yIt@"},"start_location":{"lat":28.6054896,"lng":77.350573},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":520},"duration":{"text":"2 mins","value":107},"end_location":{"lat":28.610521,"lng":77.3542903},"html_instructions":"Continue straight<div style=\"font-size:0.9em\">Pass by Punjab National Bank ATM (on the left in 400&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"errmDambwMsANQ@CUWcE[kEASE]CIGMEM[i@c@{@CEGMy@yAg@cAk@cA"},"start_location":{"lat":28.6085146,"lng":77.3500901},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1453},"duration":{"text":"3 mins","value":207},"end_location":{"lat":28.6235305,"lng":77.3551031},"html_instructions":"Turn <b>left<\/b> at <b>Labour Chowk<\/b><div style=\"font-size:0.9em\">Pass by Central Power Research Institute (on the left in 1.2&nbsp;km)<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"w~rmDigcwMO?[Ac@EOA_H_AEAoBYoASaACU?a@AeCE[?wECwBAiHEW?yPIgB?qB?aHE"},"start_location":{"lat":28.610521,"lng":77.3542903},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"qyqmDsmbwMGE_BNaAHMaBaGh@mLdAQ@CUs@oKGq@m@oAiBiDsAgCk@AyIiA_Em@wAC{KKs^QyE?aHE"}
         * summary : Kamal Marg
         * warnings : []
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean implements Serializable{
            /**
             * northeast : {"lat":28.6235305,"lng":77.3551031}
             * southwest : {"lat":28.604571,"lng":77.3499964}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean implements Serializable{
                /**
                 * lat : 28.6235305
                 * lng : 77.3551031
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean implements Serializable{
                /**
                 * lat : 28.604571
                 * lng : 77.3499964
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean implements Serializable{
            /**
             * points : qyqmDsmbwMGE_BNaAHMaBaGh@mLdAQ@CUs@oKGq@m@oAiBiDsAgCk@AyIiA_Em@wAC{KKs^QyE?aHE
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean implements Serializable{
            /**
             * distance : {"text":"2.5 km","value":2459}
             * duration : {"text":"7 mins","value":414}
             * end_address : 126, Noida-Khoda Rd, Makanpur Colony, Sector 62, Noida, Uttar Pradesh 201309, India
             * end_location : {"lat":28.6235305,"lng":77.3551031}
             * start_address : C-1/68, Block B, Sector 55, Noida, Uttar Pradesh 201301, India
             * start_location : {"lat":28.604571,"lng":77.3501758}
             * steps : [{"distance":{"text":"0.1 km","value":97},"duration":{"text":"1 min","value":32},"end_location":{"lat":28.6054193,"lng":77.3500774},"html_instructions":"Head <b>north<\/b>","polyline":{"points":"qyqmDsmbwMAAAA?AC?A?m@Do@Hw@FI@"},"start_location":{"lat":28.604571,"lng":77.3501758},"travel_mode":"DRIVING"},{"distance":{"text":"49 m","value":49},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.6054896,"lng":77.350573},"html_instructions":"Turn <b>right<\/b> toward <b>Kamal Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{~qmD_mbwMMaB"},"start_location":{"lat":28.6054193,"lng":77.3500774},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":340},"duration":{"text":"1 min","value":55},"end_location":{"lat":28.6085146,"lng":77.3500901},"html_instructions":"Turn <b>left<\/b> onto <b>Kamal Marg<\/b>","maneuver":"turn-left","polyline":{"points":"i_rmDapbwMaGh@yIt@"},"start_location":{"lat":28.6054896,"lng":77.350573},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":520},"duration":{"text":"2 mins","value":107},"end_location":{"lat":28.610521,"lng":77.3542903},"html_instructions":"Continue straight<div style=\"font-size:0.9em\">Pass by Punjab National Bank ATM (on the left in 400&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"errmDambwMsANQ@CUWcE[kEASE]CIGMEM[i@c@{@CEGMy@yAg@cAk@cA"},"start_location":{"lat":28.6085146,"lng":77.3500901},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1453},"duration":{"text":"3 mins","value":207},"end_location":{"lat":28.6235305,"lng":77.3551031},"html_instructions":"Turn <b>left<\/b> at <b>Labour Chowk<\/b><div style=\"font-size:0.9em\">Pass by Central Power Research Institute (on the left in 1.2&nbsp;km)<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"w~rmDigcwMO?[Ac@EOA_H_AEAoBYoASaACU?a@AeCE[?wECwBAiHEW?yPIgB?qB?aHE"},"start_location":{"lat":28.610521,"lng":77.3542903},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean implements Serializable{
                /**
                 * text : 2.5 km
                 * value : 2459
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean implements Serializable{
                /**
                 * text : 7 mins
                 * value : 414
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean implements Serializable{
                /**
                 * lat : 28.6235305
                 * lng : 77.3551031
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean implements Serializable{
                /**
                 * lat : 28.604571
                 * lng : 77.3501758
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean implements Serializable
            {
                /**
                 * distance : {"text":"0.1 km","value":97}
                 * duration : {"text":"1 min","value":32}
                 * end_location : {"lat":28.6054193,"lng":77.3500774}
                 * html_instructions : Head <b>north</b>
                 * polyline : {"points":"qyqmDsmbwMAAAA?AC?A?m@Do@Hw@FI@"}
                 * start_location : {"lat":28.604571,"lng":77.3501758}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX implements Serializable{
                    /**
                     * text : 0.1 km
                     * value : 97
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX implements Serializable{
                    /**
                     * text : 1 min
                     * value : 32
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX implements Serializable{
                    /**
                     * lat : 28.6054193
                     * lng : 77.3500774
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean implements Serializable {
                    /**
                     * points : qyqmDsmbwMAAAA?AC?A?m@Do@Hw@FI@
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX implements Serializable{
                    /**
                     * lat : 28.604571
                     * lng : 77.3501758
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}
