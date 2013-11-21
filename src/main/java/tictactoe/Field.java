public class Field {

        private boolean taken;
        public Slot mark = new Slot();

        private Boolean taken() {
           return taken;
        }
    public void setSlot(Slot mark) {
        this.mark = mark;
    }
        public int getSlot() {
            return mark.Slot;
        }

        public boolean place(Slot x) {
            if (!(taken)) {
            mark = x;
            taken = true;
            return taken;
        }
        return false;
        }
}
