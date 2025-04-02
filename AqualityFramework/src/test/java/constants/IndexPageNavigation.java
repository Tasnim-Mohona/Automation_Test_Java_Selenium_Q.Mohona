package constants;

import lombok.Getter;

    @Getter
    public enum IndexPageNavigation {
        CLICK_HERE("Click Here"),
        CHECKBOXES("Checkboxes"),
        MULTIPLE_WINDOWS("Multiple Windows"),
        JAVASCRIPT_ALERT("JavaScript Alerts"),
        SORTABLE_DATA_TABLES("Sortable Data Tables"),
        DYNAMIC_CONTROLS("Dynamic Controls"),
        FILE_DOWNLOAD("File Download"),
        FILE_UPLOAD("File Upload"),
        BASIC_AUTH("Basic Auth"),
        ADD_DELETE_ELEMENTS("Add/Remove Elements");
        private final String label;

        IndexPageNavigation(String label) {
            this.label = label;
        }
    }
