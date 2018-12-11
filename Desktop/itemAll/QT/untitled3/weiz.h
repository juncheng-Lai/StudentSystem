#ifndef WEIZ_H
#define WEIZ_H

#include <QDialog>

namespace Ui {
class weiz;
}

class weiz : public QDialog
{
    Q_OBJECT

public:
    explicit weiz(QWidget *parent = 0);
    ~weiz();

private:
    Ui::weiz *ui;
};

#endif // WEIZ_H
