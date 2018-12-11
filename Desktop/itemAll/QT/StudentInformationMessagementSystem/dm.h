#ifndef DM_H
#define DM_H

#include <QDialog>

namespace Ui {
class DM;
}

class DM : public QDialog
{
    Q_OBJECT

public:
    explicit DM(QWidget *parent = 0);
    ~DM();

private:
    Ui::DM *ui;
};

#endif // DM_H
