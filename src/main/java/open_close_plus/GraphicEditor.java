package open_close_plus;

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s == null) {
            return;
        }
        s.draw();
    }

}
